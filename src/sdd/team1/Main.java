package sdd.team1;
import sdd.team1.david.server.Server;
import  sdd.team1.david.client.Client;
import sdd.team1.david.util.*;
import java.sql.*;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        try{
//
            Calendar rightNow = Calendar.getInstance();
            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
            System.out.println(hour);
//
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con=DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/SDD_PROJECT","sddproject","password    ");
////here sonoo is database name, root is username and password
//            Statement stmt=con.createStatement();
//            ResultSet rs=stmt.executeQuery("SELECT * FROM TEST");
//            while(rs.next())
//                System.out.println(rs.getString(1)+"  "+rs.getInt(2));
//            con.close();
           // Runtime.getRuntime().exec("mysqldump -u sddproject -p password SDD_PROJECT > dump.sql");
//            Process p;
//            p = Runtime.getRuntime().exec(new String[]{
//                   "mysqldump -u sddproject -p password SDD_PROJECT > dump.sql"
//            });
        }catch(Exception e){ System.out.println(e);}
    }


}

