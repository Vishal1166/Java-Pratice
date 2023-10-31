package com.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import com.model.Bill;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/DisplayController")
public class DisplayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public DisplayController() {
        // TODO Auto-generated constructor stub
    }	
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
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
		
		Bill bill=(Bill) session.getAttribute("Bill");               // bill = key 
		pw.print("<h1> FINAL BILL </h1>");
		pw.print("<h3> Bill No :"+bill.getBillno()+"</h3>");
		pw.print("<h3> Bill no :"+new Date().getDate()+"</h3>");
		pw.print("<h3> Bill TOTAL:"+bill.getTotal()+"</h3>");
		pw.print("<h3> Bill CGST :"+bill.getCgst()+"</h3>");
		pw.print("<h3> Bill SGST :"+bill.getSgst()+"</h3>");
		pw.print("<h3> Bill FINAL  :"+bill.getFinaltotal()+"</h3>");
		pw.print("------------------THANK YOU------------------");

	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
