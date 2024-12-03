package com.xworkz.movieServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class MovieServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method is Running");
		PrintWriter writer = res.getWriter();
		res.setContentType("text/html");
		writer.println("Movie Added"+"<br>");
		writer.println("<head>");
		writer.println("<title>"+"WebPage"+"</title>");
		writer.println("</head>");
		writer.println("<html>");
		writer.println("<body>");
		writer.print("Movie Name is: "+req.getParameter("movieName")+"<br>");
		writer.print("Hero Name is: "+req.getParameter("heroName")+"<br>");
		writer.print("Heroine Name is: "+req.getParameter("heroine")+"<br>");
		writer.print("Movie Rating is: "+req.getParameter("rating")+"<br>");
		writer.print("Movie Language is: "+req.getParameter("language")+"<br>");
		writer.println("</body>");
		writer.println("</html>");

		writer.close();
	}

}
