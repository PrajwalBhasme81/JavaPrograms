package com.xworkz.ad.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ad.reporisitory.AdAgencyRepo;
import com.xworkz.ad.reporisitory.AdAgencyRepoImp;
import com.xworkz.ad.service.AdAgencyService;
import com.xworkz.ad.service.AdAgencyServiceImp;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

	public LoginServlet() {
		
	}
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        AdAgencyRepo repo = new AdAgencyRepoImp();
    	AdAgencyService service = new AdAgencyServiceImp(repo);

        boolean isValidUser = service.findByUsernameAndPassword(email, password);

        if (isValidUser) {
        	RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");
            try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				e.printStackTrace();
			}
            
        } else {
            request.setAttribute("errorMessage", "Invalid credentials. Please try again.");
            try {
				response.sendRedirect("index.jsp");
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }
}