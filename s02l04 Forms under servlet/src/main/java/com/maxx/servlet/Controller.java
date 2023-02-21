package com.maxx.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("full_name"));
		response.getWriter().println(request.getParameter("gender"));
		String [] languages=request.getParameterValues("language");
		if(languages!=null)
		{
			for(String temp : languages)
			{
				response.getWriter().println(temp.toUpperCase());
			}
		}
		else
		{
			response.getWriter().println("No language Selected");	
		}
		response.getWriter().println(request.getParameter("country"));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().println(request.getParameter("full_name"));
		response.getWriter().println(request.getParameter("gender"));
		PrintWriter out = response.getWriter();
		String [] countries = request.getParameterValues("language");
		if(countries!=null)
		{
			for(String temp : countries)
			{
				out.println(temp.toUpperCase());
			}
		}
		else
		{
			out.println("No language Selected");	
		}
		
		response.getWriter().println(request.getParameter("country"));
	}

}
