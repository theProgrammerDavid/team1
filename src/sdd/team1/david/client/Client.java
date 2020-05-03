package sdd.team1.david.client;
import sdd.team1.david.util.*;
import java.net.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class Client {

    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream output = null;
    private ConfigReader c;
    private Connection con;
    private String address;
    private int port;

    private void CreateDump() throws IOException {

    }


    private void  TransferData(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+c.getProperty("DATABASE_NAME"),c.getProperty("USERNAME"),c.getProperty("PASSWORD"));
//        } catch (ClassNotFoundException | SQLException e) {
//            e.printStackTrace();
//        }

    }


    public void startListening() throws IOException{
        while(true) {
            try{
                this.socket = new Socket(this.address, this.port);
                TransferData();
            }
            catch(UnknownHostException u){
                System.out.println("\nSystem could not find the computer with the IP address specified\n");
            }
            finally {
                socket.close();

            }
        }
    }

    public Client() throws IOException {
        c = new ConfigReader("client1.properties");
    }
}
