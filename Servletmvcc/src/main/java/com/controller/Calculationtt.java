package com.controller;
import java.io.IOException;
import java.io.PrintWriter;

import com.model.Calculation1;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Calculationtt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Calculationtt()
    {
      super();
    }	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		String msg=null;
		String str1=request.getParameter("no1");
		String str2=request.getParameter("no2");
		String str3=request.getParameter("btn");
		
		int n1=Integer.parseInt(str1);
		int n2=Integer.parseInt(str2);
		
	  Calculation1 c=new Calculation1();
		
		c.setNo1(n1);
		c.setNo2(n2);
		
		if(str3.equals("add"))
		{
			c.setAns(c.getNo1()+c.getNo2());
			msg="Addition :";
		}
		if(str3.equals("sub"))
		{
			c.setAns(c.getNo1()-c.getNo2());
			msg="Substration :";
		}
		
		PrintWriter pw=response.getWriter();
		pw.print("<h1>"+msg+"is"+c.getAns()+"</h1>");
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
