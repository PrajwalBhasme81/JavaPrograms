package com.xworkz.farmer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.farmer.dto.FarmerDto;
import com.xworkz.farmer.repository.FarmerRepo;
import com.xworkz.farmer.repository.FarmerRepoImp;
import com.xworkz.farmer.service.FarmerService;
import com.xworkz.farmer.service.FarmerServiceImp;

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {

	public UpdateServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("search operation");

		FarmerRepo r1 = new FarmerRepoImp();
		FarmerService s1 = new FarmerServiceImp(r1);

		int id = Integer.parseInt(request.getParameter("id"));

		FarmerDto dto = s1.searchById(id);

		request.setAttribute("search", dto);

		RequestDispatcher dispatch = request.getRequestDispatcher("update.jsp");

		try {
			dispatch.forward(request, response);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) {

		FarmerDto dto = new FarmerDto();

		System.out.println("Servlet is Running");

		dto.setName(req.getParameter("farmerName"));
		dto.setContactNumber(Long.parseLong(req.getParameter("contactNumber")));
		dto.setAddress(req.getParameter("address"));
		dto.setArea(Double.parseDouble(req.getParameter("area")));
		dto.setSoilType(req.getParameter("soilType"));

		FarmerRepo r1 = new FarmerRepoImp();
		FarmerService s1 = new FarmerServiceImp(r1);

		int id = Integer.parseInt(req.getParameter("id"));

		String updateResult = s1.updateById(id, dto);

		req.setAttribute("updateResult", updateResult);

		RequestDispatcher dispatch = req.getRequestDispatcher("view.jsp");

		try {
			dispatch.forward(req, res);
		} catch (ServletException | IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
