package com.Controller;
import java.io.IOException;
import com.Dao.RegisterDao;
import com.Model.Register;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class RegisterController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    public RegisterController()
    { 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String rno=request.getParameter("rno");
		String fname=request.getParameter("fname");
		String mob=request.getParameter("mob");		
		int Regno=Integer.parseInt(rno);
		String uname=request.getParameter("user");
		String pass=request.getParameter("pass");
		float amt=Float.parseFloat(request.getParameter("amt"));
		
		Register reg=new Register();
		reg.setRegno(Regno);
		reg.setFname(fname);
		reg.setMob(mob);
		reg.setUname(uname);
		reg.setPass(pass);
		reg.setAmount(amt);
		
       RegisterDao rd=new RegisterDao();
       int i=rd.savedata(reg);
		if(i>0)
		{
			response.sendRedirect("Login.html");
		}	
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}