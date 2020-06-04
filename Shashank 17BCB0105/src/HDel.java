

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HDel")
public class HDel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HDel() {
        super();
        // TODO Auto-generated constructor stub
    }

    String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="delete from customers where id=?;";
    
	public int add(String id) throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
			
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,id);
			
		int i = st.executeUpdate();
			
		return i;

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		//out.println(id);
		
		try
		{
		int j = add(id);
		//out.println(j);
	
		if(j>=1)
		{
		    out.println("Deleted Successfully !!");	
		}
		else 
		{
			out.println("No Record deleted !!");
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}
