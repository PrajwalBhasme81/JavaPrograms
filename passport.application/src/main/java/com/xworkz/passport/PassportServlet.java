package com.xworkz.passport;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/submit")
public class PassportServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet is Running");
		String name = req.getParameter("userName");
		String email = req.getParameter("email");
		String fname = req.getParameter("fatherName");
	//	String aadhar = req.getParameter("aadharNumber");
		Long aadhar = Long.parseLong(req.getParameter("aadharNumber"));
		String pan = req.getParameter("panNumber");
		String voter = req.getParameter("voterNumber");
	//	String contact = req.getParameter("contactNumber");
		Long contact = Long.parseLong(req.getParameter("contactNumber"));
		String place = req.getParameter("place");
		String district = req.getParameter("district");
		String state = req.getParameter("state");
	//	String pin = req.getParameter("pincode");
		Long pin = Long.parseLong(req.getParameter("pincode"));
		System.out.println("User Name: "+name+" "+"Email: "+email+" "+"Father Name: "+fname+" "+"Aadhar Number: "
		+aadhar+" "+"PanCard Number: "+pan+" "+"VoterId: "+voter+" "+"Contact Number: "+contact+" "+"Place: "+place+
		" "+"District: "+district+" "+"State: "+state+" "+"Pincode: "+pin);
		
		req.setAttribute("uName", name);
		req.setAttribute("email", email);
		req.setAttribute("fName", fname);
		req.setAttribute("aadhar", aadhar);
		req.setAttribute("pan", pan);
		req.setAttribute("voter", voter);
		req.setAttribute("contact", contact);
		req.setAttribute("place", place);
		req.setAttribute("district", district);
		req.setAttribute("state", state);
		req.setAttribute("pin", pin);
		RequestDispatcher request= req.getRequestDispatcher("success.jsp");
		request.forward(req, res);
	}

}
