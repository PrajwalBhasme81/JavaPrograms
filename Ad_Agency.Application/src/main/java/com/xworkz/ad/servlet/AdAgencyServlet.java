package com.xworkz.ad.servlet;

import java.io.IOException;

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

@WebServlet(urlPatterns = "/submit")
public class AdAgencyServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		AdAgencyDto dto = new AdAgencyDto();
		dto.setPersonName(req.getParameter("personName"));
		dto.setCompanyName(req.getParameter("companyName"));
		dto.setEmail(req.getParameter("email"));
		dto.setPassword(req.getParameter("password"));
		dto.setContact(Long.parseLong(req.getParameter("contact")));
		dto.setProductName(req.getParameter("product"));
		dto.setDescription(req.getParameter("description"));

		AdAgencyRepo r1 = new AdAgencyRepoImp();
		AdAgencyService s1 = new AdAgencyServiceImp(r1);
		s1.save(dto);

		RequestDispatcher dispatcher = req.getRequestDispatcher("success.jsp");
		try {
			dispatcher.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}

	}

}
