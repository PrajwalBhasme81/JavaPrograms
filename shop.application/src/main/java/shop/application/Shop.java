package shop.application;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class Shop implements Servlet{

	@Override
	public void destroy() {
		System.out.println("destory");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("ServletConfig");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
		String p_Name = arg0.getParameter("productName");
		System.out.println("Product Name is: "+p_Name);
		Integer q = Integer.parseInt(arg0.getParameter("quantity"));
		System.out.println("Product quantity is: "+q);
		Integer a = Integer.parseInt(arg0.getParameter("amount"));
		System.out.println("Product Amount is: "+a);
		
		int total_amount = q * a;
		System.out.println("Total Amount is :"+total_amount);
		
	}
	
	

}
