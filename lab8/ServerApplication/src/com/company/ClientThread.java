package com.company;
import java.net.*;
import java.io.*;

public class ClientThread extends Thread {
    private Socket socket = null;
    private SocialNetworkServer server;
    SocialNetwork net = new SocialNetwork(socket);

    ClientThread(Socket socket) throws FileNotFoundException, UnsupportedEncodingException {
        this.socket = socket;
       // this.server = server;
    }

    @Override
    public void run() {
        try {
            while (true) {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //client -> server stream
                String request = in.readLine();
                System.out.println("\r\nMessage from " + Thread.currentThread().getName() + ": " + request);
                String response = execute(request);
                if (request.equalsIgnoreCase("stop")) {
                    System.exit(0);
                }
                PrintWriter out = new PrintWriter(socket.getOutputStream()); //server -> client stream
                out.println(response);
                // gracefully stop!!!

                out.flush();
            }
        } catch (IOException e) {
            System.err.println("Communication error... " + e);
        } finally {
            try {
                socket.close(); // or use try-with-resources
            } catch (IOException e) {
                System.err.println(e);
            }
        }
    }

    // display the message: "Server received the request ... "
    private String execute(String request) throws IOException {
        String response;
        response = null;
        CommandBuilder commandBuilder = new CommandBuilder();
        Command command;
        if (request.equalsIgnoreCase("stop")) {
            response = "Goodbye!";
        } else {
            System.out.println("Server received the request " + request);
            command = commandBuilder.CommandBuilder(request);
            response = command.execute(net, socket);
        }
        return response;
    }
}

