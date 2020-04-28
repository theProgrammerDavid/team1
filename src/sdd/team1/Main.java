package sdd.team1;
import sdd.team1.david.server.Server;
import  sdd.team1.david.client.Client;
import sdd.team1.david.util.*;
import java.sql.*;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Main {

    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/SDD_PROJECT","sddproject","passwordg");
//here sonoo is database name, root is username and password
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM TEST");
            while(rs.next())
                System.out.println(rs.getString(1)+"  "+rs.getInt(2));
            con.close();
        }catch(Exception e){ System.out.println(e);}
    }


}

