package com.Controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.Dao.RegisterDao;
import com.Model.Register;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SearchController extends jakarta.servlet.http.HttpServlet {
	private static final long serialVersionUID = 1L;
    public SearchController()
    { 
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		 PrintWriter out=response.getWriter();
		 
		String str=request.getParameter("rno");	
		int rno=Integer.parseInt(str);
			
		 RegisterDao rd=new RegisterDao();
		 List<Register> lst=rd.Search(rno);	
		 Register r=(Register)lst.get(0);		 
			 out.println(r.getRegno()+"\t"+r.getFname()+"\t"+r.getMob()+"\t"+r.getAmount());		 
	}			 	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
