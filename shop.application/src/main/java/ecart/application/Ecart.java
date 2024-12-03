package ecart.application;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/Click")
public class Ecart implements Servlet{

	@Override
	public void destroy() {
		System.out.println("Destory");
		
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletConfig");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("getServletInfo");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("ServletConfig");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service");
		
		
	}

}
