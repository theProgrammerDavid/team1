package sdd.team1;
import sdd.team1.david.util.ConfigReader;
import sdd.team1.david.server.Server;
import  sdd.team1.david.client.Client;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello word");
        ConfigReader c = null;
        try {
            c = new ConfigReader("client1.properties");
        }catch(Exception e){
            System.out.println("Error");
        }
        assert c != null;
        System.out.println(c.getProperty("MYSQL_USERNAME"));
    }
}
