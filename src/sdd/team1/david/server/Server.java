package sdd.team1.david.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import sdd.team1.david.util.Message;
import java.util.List;

public class Server {
    public void createDump(){
       try{
           System.out.println("Working Directory = " + System.getProperty("user.dir"));
           ProcessBuilder pb = new ProcessBuilder();
           pb.command("bash","/home/david/Development/java-test/src/sdd/team1/david/util/dbdump.sh",System.getProperty("user.dir"));
           pb.directory(new File("/bin"));
           pb.redirectOutput(new File("./log"));
           pb.redirectErrorStream(true);
           Process p = pb.start();
       }
       catch(IOException e){

       }
    }
    private void checkForOld(){

    }
    private void dumpTransferFailed(){

    }

    public void start(){
        try{
            while(true){
                server();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void server() throws  ClassNotFoundException {
        try {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("ServerSocket awaiting connections...");

            Socket socket = ss.accept(); // blocking call, this will wait until a connection is attempted on th$is

            String x = "a piece of data";
            OutputStream outputStream = socket.getOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(x);

            socket.close();
            ss.close();
        }
        catch (IOException e){
            dumpTransferFailed();
        }
    }
}
