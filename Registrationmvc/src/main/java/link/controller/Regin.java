package link.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class Regin extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;

    public Regin()
    {
  
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String rno=request.getParameter("rno");
		String fname=request.getParameter("fname");
		String mob=request.getParameter("mob");		
		int Regno=Integer.parseInt(rno);
		int i=0;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","123456789");
			PreparedStatement pt=con.prepareStatement("insert into student values(?,?,?)");
			pt.setInt(1,Regno);
			pt.setString(2, fname);
			pt.setString(3, mob);
			 i =pt.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0)
		{
			response.sendRedirect("Login.html");
		}
		else
		{
			response.sendRedirect("Error.html");
		}		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
