package com.xworkz.nameApp;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/submit")
public class NameServlet extends HttpServlet{
		
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ram");
		arr.add("Laxman");
		arr.add("Hanuman");
			
		req.setAttribute("friends", arr);
			
		RequestDispatcher request = req.getRequestDispatcher("index.jsp");
		request.forward(req, resp);		
	}
}

