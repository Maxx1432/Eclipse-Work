package com.maxx.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class siteController
 */
@WebServlet("/site")
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String page= request.getParameter("page");
		page=page.toLowerCase();
		
		switch (page) {
		case "home": {
			homePage(request, response);
			break;
		}
		default:
			errorPage(request, response);
		}
	}
	
	public void homePage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Home Page");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
	
	public void errorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Error Page");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}

}
