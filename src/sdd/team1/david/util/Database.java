package sdd.team1.david.util;

import javax.swing.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * This class will be used to manipulate the database.
 * Requirements: mysql environment variables to be configured properly
 */
public class Database {
    public static void MysqlDump(String username, String password, String databaseName, String outputFile ){
        try {

            /*NOTE: Used to create a cmd command*/
            String executeCmd = "mysqldump -u"+username +" -p" + password + " "+databaseName+" -r " + outputFile;

            /*NOTE: Executing the command here*/
            Process runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            /*NOTE: processComplete=0 if correctly executed, will contain other values if not
            * This will also be logged
            * */

            if (processComplete == 0) {
                System.out.println("Backup Complete");
            } else {
                System.out.println("Backup Failure");
            }

        } catch (IOException | InterruptedException ex) {
            //Add Exception to Logger
        }
    }
    public void MysqlRestore(){

    }
}
