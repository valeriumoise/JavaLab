package com.company;

import java.io.IOException;
import java.net.Socket;

public class readCommand implements Command {
    String[] args;

    public readCommand(String[] args)
    {
        this.args = args;
    }

    @Override
    public String execute(SocialNetwork network, Socket socket) throws IOException {
//        String message = network.readFromKeyboard();
//        while(!message.equals("")){
//            PrintWriter out = new PrintWriter(socket.getOutputStream(), true); //server -> client stream
//            out.println("mesaj: " + message);
//            message = network.readFromKeyboard();
//        }
        StringBuilder messages = new StringBuilder();
        network.getFriends().forEach(friend -> {
            messages.append(friend.messagesToRecieve.peek());
            messages.append("\n");
            friend.messagesToRecieve.remove();
        });
        return messages.toString();
    }

}
