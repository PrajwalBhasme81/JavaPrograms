package com.xworkz.mobile.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.mobile.dto.MobileStoreDto;
import com.xworkz.mobile.excel.MobileExcel;
import com.xworkz.mobile.repository.MobileStoreRepo;
import com.xworkz.mobile.repository.MobileStoreRepoImp;
import com.xworkz.mobile.service.MobileStoreService;
import com.xworkz.mobile.service.MobileStoreServiceImp;

@WebServlet(urlPatterns = "/submit")
public class MobileStoreServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		MobileStoreDto dto = new MobileStoreDto();
		System.out.println("Servlet is Running");
		dto.setBrand(req.getParameter("brand"));
		dto.setRam(Integer.parseInt(req.getParameter("ram")));
		dto.setStorage(Integer.parseInt(req.getParameter("storage")));
		dto.setWarranty(Integer.parseInt(req.getParameter("warrenty")));
		dto.setPrice(Integer.parseInt(req.getParameter("price")));
		
		MobileStoreRepo r1 = new MobileStoreRepoImp();
		MobileStoreService s1 = new MobileStoreServiceImp(r1);
		
		String res = s1.save(dto);
		System.out.println(res);
		
		MobileExcel excel = new MobileExcel();
		excel.excelSave(dto);
		
		req.setAttribute("result", res);
		
		RequestDispatcher request = req.getRequestDispatcher("success.jsp");
		try {
			request.forward(req, resp);
		} catch (ServletException | IOException e) {
			
			e.printStackTrace();
		}
		
		
			
			
			
			
		
	}
	
	

}
