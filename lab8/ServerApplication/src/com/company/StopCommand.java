package com.company;

import java.io.IOException;
import java.net.Socket;

public class StopCommand implements Command
{
    String[] args;

    public StopCommand(String[] args)
    {
        this.args = args;
    }
    @Override
    public String execute(SocialNetwork network, Socket socket) throws IOException {
        socket.close();
        return "Server stopped";
    }
}
