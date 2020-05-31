package sdd.team1;
import sdd.team1.david.server.Server;
import sdd.team1.david.client.Client;

import java.io.File;

public class Main {


    public static void main(String[] args) {
        try{
//            Runtime.getRuntime().exec("/usr/bin/mysqldump --databases SDD_PROJECT --user=sddproject --password=password > ~/Development/java-test/lol.sql");
//            Runtime.getRuntime().exec("mysqldump -u sddproject -p password SDD_PROJECT > ~/Development/java-test/dump.sql");
//Client c = new Client();
//c.sendStuff();
//Server s = new Server();
//s.start();
Server s = new Server();
s.createDump();

  //  MyTaskExecutor te = new MyTaskExecutor(t);
//  te.startExecutionAt(16,45,30);
//  te.stop();
//            Calendar rightNow = Calendar.getInstance();
//            int hour = rightNow.get(Calendar.HOUR_OF_DAY);
//            System.out.println(hour);
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
        }catch(Exception e){ System.out.println(e);}
    }


}

