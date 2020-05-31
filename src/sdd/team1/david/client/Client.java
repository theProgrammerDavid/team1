package sdd.team1.david.client;

import sdd.team1.david.util.*;

import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Client {

    private Socket socket;

    InputStream inputStream;
    OutputStream outputStream;

    ObjectOutputStream objectOutputStream;
    ObjectInputStream objectInputStream;

    public void sendFile(String host, int port) throws IOException, ClassNotFoundException {
        //need host and port, we want to connect to the ServerSocket at port 7777
        socket = new Socket("localhost", 7777);
        System.out.println("Connected!");

        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();

        objectOutputStream = new ObjectOutputStream(outputStream);
        objectInputStream = new ObjectInputStream(inputStream);

        //we want to send a file to the server so we tell it to receive a file
        objectOutputStream.writeObject("receive");

        String res = ""; //fill this with the db dump
        objectOutputStream.writeObject(res);

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }

    public void receiveFile(String host, int port) throws IOException, ClassNotFoundException {
        //need host and port, we want to connect to the ServerSocket at port 7777
        socket = new Socket(host, port);
        System.out.println("Connected!");

        inputStream = socket.getInputStream();
        outputStream = socket.getOutputStream();

        objectOutputStream = new ObjectOutputStream(outputStream);
        objectInputStream = new ObjectInputStream(inputStream);

        //we want to receive a file so we tell the server to send us an object
        objectOutputStream.writeObject("send");

        String x = (String) objectInputStream.readObject();
        System.out.println(x);

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}
