import java.sql.*;

public class CustAdd {
	
	String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="insert into customers values(2,?,'Home','xxx@gmail.com','8877665544',CURRENT_TIMESTAMP);";
	
	public int add(String name)
	{
		int i=0;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,pass);
			
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1,name);
			
			i = st.executeUpdate();
			
			return i;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}

}
