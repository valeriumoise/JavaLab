package com.company;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class SocialNetworkServer {
    private static final int PORT = 8100;
    private ServerSocket serverSocket;
    private boolean running = false;

    Map<String, Socket> sockets = new HashMap<String,Socket>();
    static String username;


    public SocialNetworkServer(String username) throws IOException {
        ServerSocket serverSocket = null;
        this.username = username;
    }

    public static void main(String[] args) throws IOException {
        SocialNetworkServer server = new SocialNetworkServer(username);
        server.init();
        server.waitForClients(); //... handle the exceptions!
    }

    public void init() throws IOException {
        try {
            running = true;
            serverSocket = new ServerSocket(PORT);
        } catch (IOException e) {
            System.err.println("Eroare IO: " + e);
        }
    }

    public void waitForClients() throws IOException{
        try {
            while (running) {
                Socket socket = serverSocket.accept();
                // Executam solicitarea clientului intr - un fir de executie
                ClientThread t = new ClientThread(socket);
                String username = getUserName(socket);
                sockets.put(username, socket);
                t.start();
            }
        } catch (IOException e) {
            System.err.println("Eroare : " + e);
        }
    }

    private String getUserName(Socket socket) {
        return username;
    }

    public ServerSocket getServerSocket()
    {
        return serverSocket;
    }

    public Map<String, Socket>  getSockets() {return sockets;}

    public void stop() throws IOException {
        this.running = false;
        serverSocket.close();
    }
}