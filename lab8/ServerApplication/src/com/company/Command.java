package com.company;

import java.io.IOException;
import java.net.Socket;

public interface Command
{
    String execute(SocialNetwork network, Socket socket) throws IOException;
}