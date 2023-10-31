package com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.Dao.RegisterDao;
import com.Model.Register;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DisplayController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    public DisplayController()
    { 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 RegisterDao rd=new RegisterDao();
		 List<Register> lst=rd.DisplayAll();
		
		 PrintWriter out=response.getWriter();
		 out.println("<table>");
		 for(Register r: lst)	
		 {
			 out.print("<tr><td>"+r.getRegno()+"</td><td>"+r.getFname()+"</td><td>"+r.getMob()+"</td><td>"+r.getAmount()+"</td></tr>");
		 }
		 out.println("</table>");
	}			 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
