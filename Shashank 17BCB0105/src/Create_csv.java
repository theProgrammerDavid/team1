

import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Create_csv {
 public int csv() {
 
   try {
    PrintWriter pw= new PrintWriter(new File("F:\\Softwares\\sample2.csv"));
    StringBuilder sb=new StringBuilder();
 
    sb.append("Report_ID");
    sb.append(","); 
    sb.append("Name");
    sb.append(",");
    sb.append("Type");
    sb.append(",");
    sb.append("Amount");
    sb.append(",");
    sb.append("Status");
    sb.append("\r\n");
    
    Connection connection=null;
    Db_Connection obj_DB_Connection=new Db_Connection();
    connection=obj_DB_Connection.getConnection();
    ResultSet rs=null;
 
    String query="select * from reports";
    PreparedStatement ps=connection.prepareStatement(query);
    rs=ps.executeQuery();
 
    while(rs.next()){
     sb.append(rs.getString("rid"));
     sb.append(","); 
     sb.append(rs.getString("name"));
     sb.append(",");
     sb.append(rs.getString("type"));
     sb.append(",");
     sb.append(rs.getString("amount"));
     sb.append(",");
     sb.append(rs.getString("status"));
     sb.append("\r\n");
    }
 
    pw.write(sb.toString());
    pw.close();
    //System.out.println("Finished");
    return 1;
   } catch (Exception e) {
    // TODO: handle exception
   } 
   return 0;
 }
}
