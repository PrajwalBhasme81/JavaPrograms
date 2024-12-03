package com.xworkz.ad.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ad.dto.AdAgencyDto;
import com.xworkz.ad.reporisitory.AdAgencyRepo;
import com.xworkz.ad.reporisitory.AdAgencyRepoImp;
import com.xworkz.ad.service.AdAgencyService;
import com.xworkz.ad.service.AdAgencyServiceImp;

@WebServlet(urlPatterns = "/view")
public class ReadServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp){
		AdAgencyRepo r1 = new AdAgencyRepoImp();
		AdAgencyService s1 = new AdAgencyServiceImp(r1);
		
		List<AdAgencyDto> result = s1.findAll();
		req.setAttribute("read", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("view.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
