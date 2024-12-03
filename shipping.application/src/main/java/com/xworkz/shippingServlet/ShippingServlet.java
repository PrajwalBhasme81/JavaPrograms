package com.xworkz.shippingServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class ShippingServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method is Running");
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.println("Shipping Done"+"<br>");
		
		writer.println("<head>");
		writer.println("<title>"+"WebPage"+"</title>");
		writer.println("</head>");
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Email is: "+req.getParameter("email")+"<br>");
		writer.println("From: "+req.getParameter("from")+"<br>");
		writer.println("To: "+req.getParameter("to")+"<br>");
		writer.println("Contact Number: "+req.getParameter("contactNumber")+"<br>");
		writer.println("</body>");
		writer.println("</html>");
		writer.close();
		
	}

}
