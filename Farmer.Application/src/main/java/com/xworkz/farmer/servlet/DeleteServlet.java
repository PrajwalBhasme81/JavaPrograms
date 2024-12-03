package com.xworkz.farmer.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.farmer.repository.FarmerRepo;
import com.xworkz.farmer.repository.FarmerRepoImp;
import com.xworkz.farmer.service.FarmerService;
import com.xworkz.farmer.service.FarmerServiceImp;

@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet {

	public DeleteServlet() {

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FarmerRepo r1 = new FarmerRepoImp();
		FarmerService s1 = new FarmerServiceImp(r1);

		int id = Integer.parseInt(request.getParameter("id"));
		String delete = s1.deleteById(id);
		System.out.println("Delete Setvlet is Running");
		System.out.println("Id:" + id);
		request.setAttribute("delete", delete);

		RequestDispatcher req = request.getRequestDispatcher("view.jsp");
		req.forward(request, response);

	}

}
