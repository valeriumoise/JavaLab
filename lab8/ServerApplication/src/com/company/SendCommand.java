package com.company;

import java.io.IOException;
import java.net.Socket;

public class SendCommand implements Command {
    String[] args;

    public SendCommand(String[] args)
    {
        this.args = args;
    }
    SocialNetworkServer server;

    @Override
    public String execute(SocialNetwork network, Socket socket) throws IOException {
        String message = args[0];
//        for(int i=0; i<network.getFriends().size(); i++){
//            PrintWriter out = new PrintWriter(socket.getOutputStream()); //server -> client stream
//            out.println(message);
//        }
        network.getFriends().forEach(friend -> friend.messagesToRecieve.add(message));
        return "Message sent";
    }
}

