package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;


public class SocialNetwork {
    private Socket socket = null;
    private ArrayList<Person> registered = new ArrayList<>();
    private ArrayList<Person> login = new ArrayList<>();
    private ArrayList<Person> myFriends = new ArrayList<>();

    //PrintWriter writer = new PrintWriter("D:\\FACULTATE TOT\\ANUL2\\JAVA\\file.html", "UTF-8");
    //SFTPsender senderSFTP = new SFTPsender();
    //String htmlCode = htmlHeader();

    SocialNetwork(Socket socket) throws FileNotFoundException, UnsupportedEncodingException {
        this.socket = socket;
    }

    ArrayList<Person> getNetwork() throws IOException {
        // htmlCode = htmlCode.concat("Registred users: " + registered + ".\n");
        // writer.print(htmlCode);
        //SFTPsender.send("D:\\FACULTATE TOT\\ANUL2\\JAVA\\file.html");

        return registered;
    }

    void addRegistration(Person p) throws IOException {
        //htmlCode = htmlCode.concat( p.getName() + " was registred " + ".\n");
        //writer.print(htmlCode);
        //SFTPsender.send("D:\\FACULTATE TOT\\ANUL2\\JAVA\\file.html");

        registered.add(p);
    }

    void addLogin(Person p) throws IOException {
        //htmlCode = htmlCode.concat(p.getName() + " logged in.\n");
        //writer.print(htmlCode);
        //senderSFTP.send("D:\\FACULTATE TOT\\ANUL2\\JAVA\\file.html");

        login.add(p);
    }

    void addFriends(Person p) throws IOException {
        //htmlCode = htmlCode.concat(p.getName() + " added to friends.\n");
        //writer.print(htmlCode);
        //senderSFTP.send("D:\\FACULTATE TOT\\ANUL2\\JAVA\\file.html");

        myFriends.add(p);
    }

    ArrayList<Person> getFriends(){
        return myFriends;
    }


    public String readFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        // citesc toata linia de la tastatura:
        return scanner.nextLine();
    }


    private String htmlHeader() {

        return "<html>\n" +
                "\t<head>\n" +
                "\t\t<title> Social Network </title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<p>";
    }
}
