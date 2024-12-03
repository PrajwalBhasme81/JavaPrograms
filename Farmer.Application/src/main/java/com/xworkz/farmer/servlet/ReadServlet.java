package com.xworkz.farmer.servlet;

import java.io.IOException;
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

@WebServlet("/view")
public class ReadServlet extends HttpServlet {

	public ReadServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) {

		FarmerRepo r1 = new FarmerRepoImp();
		FarmerService s1 = new FarmerServiceImp(r1);

		List<FarmerDto> list = s1.read();
		request.setAttribute("listOfValue", list);

		RequestDispatcher dispatcher = request.getRequestDispatcher("view.jsp");

		try {
			dispatcher.forward(request, response);
		} catch (IOException | ServletException e) {
			e.printStackTrace();
		}
	}

}
