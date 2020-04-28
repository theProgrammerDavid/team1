package sdd.team1.david.util;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.StreamHandler;

public class Logger extends StreamHandler {
    @Override
    public  void publish(LogRecord record){
        super.publish(record);;
    }

    @Override
    public void flush(){
        super.flush();
    }
    public void close() throws SecurityException{
        super.close();
    }
}
