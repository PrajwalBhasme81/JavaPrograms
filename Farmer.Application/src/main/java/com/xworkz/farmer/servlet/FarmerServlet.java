package com.xworkz.farmer.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

@WebServlet(urlPatterns = "/submit")
public class FarmerServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FarmerDto dto = new FarmerDto();
		System.out.println("Servlet is Running");
		String fname = req.getParameter("farmerName");
		Long fcontact = Long.parseLong(req.getParameter("contactNumber"));
		String faddress = req.getParameter("address");
		Double farea = Double.parseDouble(req.getParameter("area"));
		String fsoil = req.getParameter("soilType");

		dto.setName(fname);
		dto.setContactNumber(fcontact);
		dto.setAddress(faddress);
		dto.setArea(farea);
		dto.setSoilType(fsoil);

		FarmerRepo r1 = new FarmerRepoImp();
		FarmerService s1 = new FarmerServiceImp(r1);
		String res = s1.validateandsave(dto);
		req.setAttribute("result", res);

		RequestDispatcher request = req.getRequestDispatcher("success.jsp");
		request.forward(req, resp);

	}
}
