package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/CartController")
public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CartController() {
		super();    
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		pw.println("hello ... cart servlet here.");

		//  session received from product controller 
		HttpSession session=request.getSession(true);
		List<Product> lst=(List)session.getAttribute("prod");      //  prod = key 
		pw.print("<table>");	
		for(Product p: lst)
		{
			pw.print("<tr><td>"+p.getProId()+"</td>");
			pw.print("<td>"+p.getProName()+"</td>");
			pw.print("<td>"+p.getProPrice()+"</td>");
			pw.print("<td>"+p.getProQty()+"</td></tr>");
		}
		pw.print("</table>");	

		pw.print("Click here for Bill");
		pw.print("<a href='BillController'>yes</a>");
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
