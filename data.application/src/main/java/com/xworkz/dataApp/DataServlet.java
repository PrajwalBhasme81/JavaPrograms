package com.xworkz.dataApp;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/submit")
public class DataServlet extends GenericServlet{
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet is Running");
		String name = req.getParameter("userName");
		String dob = req.getParameter("dateofbirth");
		String state = req.getParameter("state");
		String gender = req.getParameter("inlineRadioOptions");
		String language = req.getParameter("languages");
		
		req.setAttribute("uName",name);
		req.setAttribute("uDob",dob);
		req.setAttribute("uState",state);
		req.setAttribute("uGender",gender);
		req.setAttribute("uLang",language);
		RequestDispatcher request = req.getRequestDispatcher("success.jsp");
		request.forward(req, res);
	}
	
	

}
