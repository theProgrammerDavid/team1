package sdd.team1;

public class BatchJob {

    /**
     * Denotes the hour (24h clock) when the batch job executes
     */
    private  byte startTime;


    public BatchJob(){

    }

    /**
     * Parameterized Constructor
     * @param startTime Denotes the hour of the day (24h clock format) at which the batch job starts
     *
     */
    public BatchJob(byte startTime){
    this.startTime=startTime;
    }

    /**
     * Queries the server if any unprocessed data exists. This could arise out of an exception or loss of power or networking
     */
    public void processOld(){
//DateTime dt = new DateTime();
    }


    /**
     * Function to set the start time
     * @param startTime Denotes the hour of the day (24h clock format) at which the batch job starts
     *
     */
    public void startJobAt(byte startTime){
    this.startTime=startTime;
    }


}
