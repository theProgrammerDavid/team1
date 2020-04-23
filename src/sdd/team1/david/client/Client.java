package sdd.team1.david.client;

import sdd.team1.david.util.ConfigReader;

import java.util.Vector;


public class Client {


    private String MySQLUsername;
    private int NumTables;
    private Vector TableNames;

    public String getMySQLUsername(){return this.MySQLUsername;}
    public int getNumTables(){return  this.NumTables;}


    public Client()
    {
        TableNames = new Vector<String>();
    }
}
