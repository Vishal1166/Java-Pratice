package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import com.model.Product;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	List<Product> prodlist=null;
	public void init()
	{
		prodlist=new LinkedList<Product>();
	}
	public ProductController() {      
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter pw=response.getWriter();
		int proId=Integer.parseInt(request.getParameter("pid"));
		String proName=request.getParameter("pname");
		float proPrice=Float.parseFloat(request.getParameter("pprice"));
		int proQty=Integer.parseInt(request.getParameter("pqty"));

		Product prod=new Product(proId, proName, proPrice, proQty);
		prodlist.add(prod);
		//    session is created and send to cartcontroller 
		HttpSession session=request.getSession(true);
		session.setAttribute("prod",prodlist);  //  prod= key , prodlist = list object  pass to session

		pw.print("do you want add more product in cart click yes : ");
		pw.print("<a href='Product.html'>Yes</a>");
		pw.println("To conform product click yes : ");
		pw.print("<a href='CartController'>Yes</a>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}


