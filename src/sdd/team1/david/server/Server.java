package sdd.team1.david.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import sdd.team1.david.util.Message;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class Server {
    private String pwd;

    public Server() {
        pwd = System.getProperty("user.dir");
    }

    public void createDump() {
        try {

            ProcessBuilder pb = new ProcessBuilder();
            pb.command("bash", this.pwd + "/src/sdd/team1/david/util/dbdump.sh", System.getProperty("user.dir"));
            pb.directory(new File("/bin"));
            pb.redirectOutput(new File("./log.txt"));
            pb.redirectErrorStream(true);
            pb.redirectError(new File("./errorFile"));
            Process p = pb.start();
            p.waitFor();
        } catch (IOException e) {
            File oldFile = new File(this.pwd + "/dump.sql");
            if (oldFile.exists()) {
                oldFile.delete();
            }
        } catch (InterruptedException ie) {
            //TODO
        }
    }

    /*
           1. check for transfer failure.
            a) if exists, send the string "transferError" followed by the file data
            b) if doesnt exist, send the string "null"
           2. check if dump file exists.
            a) if it exists, send contents of file as string
            b) if doesnt exist, send error log file
            */
    private String checkForOld() {
        String res;

        try {
            File errorLogFile = new File(this.pwd + "./transferError.sql");
            if (errorLogFile.exists()) {
                res = Files.readString(errorLogFile.toPath(), StandardCharsets.US_ASCII);
            } else {
                res = "null";
            }

        } catch (IOException e) {
            res = "error";
        }

        return res;
    }

    private void dumpTransferFailed() {
        File oldFile = new File(this.pwd + "./dump.sql");
        File newFile = new File(this.pwd + "./transferError.sql");
        oldFile.renameTo(newFile);
    }

    public void start() {
        try {
            while (true) {
                server();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void server() throws ClassNotFoundException {
        try {
            ServerSocket ss = new ServerSocket(7777);
            System.out.println("ServerSocket awaiting connections...");

            Socket socket = ss.accept(); // blocking call, this will wait until a connection is attempted on this
            InputStream inputStream = socket.getInputStream();
            OutputStream outputStream = socket.getOutputStream();

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            String x = (String) objectInputStream.readObject();
            if (x.equals("send")) {
                //the client wants us to send the file

                String res = checkForOld();
                objectOutputStream.writeObject(res);
            } else {
                //the client wants us to receive a file
                String res = (String)objectInputStream.readObject();
            }


//


            socket.close();
            ss.close();
        } catch (IOException e) {
            dumpTransferFailed();
        }
    }
}
