package sdd.team1.david.client;
import sdd.team1.david.util.*;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
public class Client {

    public void sendStuff() throws IOException, ClassNotFoundException {
        // need host and port, we want to connect to the ServerSocket at port 7777
        Socket socket = new Socket("localhost", 7777);
        System.out.println("Connected!");
        InputStream inputStream = socket.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

        String x = (String)objectInputStream.readObject();
        System.out.println(x);

        System.out.println("Closing socket and terminating program.");
        socket.close();
    }
}
