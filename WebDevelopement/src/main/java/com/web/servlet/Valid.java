package com.xworkz.validationServlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/click")
public class ValidateServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet is Running");
		String name = req.getParameter("userName");
		
		req.setAttribute("uName", name);
		
		RequestDispatcher request= req.getRequestDispatcher("index.jsp");
		request.forward(req, resp);
	}

}
