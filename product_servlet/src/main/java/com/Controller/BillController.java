package com.Controller;

import java.io.IOException;
import java.util.List;

import com.model.Bill;
import com.model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/BillController")
public class BillController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public BillController() {
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session=request.getSession(true);
		List<Product> lst=(List)session.getAttribute("prod");      //  prod = key 
		
	    float total=0,finaltotal=0,cgst=0,sgst=0;
		for(Product p: lst)
		{
			total=total+p.getProPrice()*p.getProQty();
		}
		cgst=total*0.06f;
		sgst=total*0.06f;
		finaltotal=total+cgst+sgst;
		
		Bill bobj=new Bill(111,total,cgst,sgst,finaltotal);
		session.setAttribute("Bill",bobj);          // one more session here  key= bill
		response.sendRedirect("DisplayController");		
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}
}
