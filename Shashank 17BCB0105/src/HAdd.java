

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/HAdd")
public class HAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public HAdd() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    String url="jdbc:mysql://localhost:3307/loancollection";
	String username="root";
	String pass="1234";
	String query="insert into customers values(?,?,'Home',?,?,CURRENT_TIMESTAMP);";
	
	public int add(String id,String name,String amount,String status) throws Exception
	{
		int i=0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,pass);
			
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,id);
		st.setString(2,name);
		st.setString(3,amount);
		st.setString(4,status);
			
		i = st.executeUpdate();
			
		return i;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("uname");
		String email = request.getParameter("email");
		String mob = request.getParameter("mob");
		
		PrintWriter out = response.getWriter();
		
		try
		{
		int j = add(id,name,email,mob);
		//out.println(j);
		if(j==1)
		{
		out.println(name + " named customer Added Successfully !!");	
		//out.println(name + email + mob + username);
		}
		else
		{
			out.println("No Record inserted");
		}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		
	}

}
