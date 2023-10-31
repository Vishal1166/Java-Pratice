package com.Controller;
import java.io.IOException;
import com.Dao.RegisterDao;
import com.Model.Login;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class LoginController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginController()
    { 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{		
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");		
		Login lo=new Login();	
		lo.setUname(uname);
		lo.setPass(pass);
		
       RegisterDao rd=new RegisterDao();
       boolean b=rd.validetuser(lo);
		if(b)
		{
			response.sendRedirect("Welcome.html");
		}
		else
		{
			response.sendRedirect("Login.html");
		}	
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}