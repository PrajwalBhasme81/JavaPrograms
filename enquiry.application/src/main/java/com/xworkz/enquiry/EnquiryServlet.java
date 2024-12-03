package com.xworkz.enquiry;

import java.io.File;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/submit")
public class EnquiryServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		EnquiryDto dto = new EnquiryDto();
		
		dto.setName(req.getParameter("userName"));
		dto.setEmail(req.getParameter("email"));
		dto.setNumber(Long.parseLong(req.getParameter("contactNumber")));
		dto.setDescription(req.getParameter("description"));
		
		String name = dto.getName();
		String email = dto.getEmail();
		long number = dto.getNumber();
		String description = dto.getDescription();
		
		System.out.println("Name: "+name+" "+"Email: "+email+" "+"Contact Number: "+number+" "+"Description: "+description);
		
		EnquiryFileOperation file = new EnquiryFileOperation();
		file.writeFile(dto);
		File f = new File("Enquiry.txt");

		req.setAttribute("Name", name);
		req.setAttribute("Email", email);
		req.setAttribute("Number", number);
		req.setAttribute("Description", description);
		RequestDispatcher request= req.getRequestDispatcher("success.jsp");
		request.forward(req, resp);
		
	}
	
	
	
}
