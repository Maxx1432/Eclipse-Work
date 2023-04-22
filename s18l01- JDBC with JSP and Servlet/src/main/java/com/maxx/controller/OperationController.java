package com.maxx.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.maxx.entity.User;
import com.maxx.model.UsersModel;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name ="jdbc/project" )
	private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String page= request.getParameter("page");
	page=page.toLowerCase();
	
	switch (page) {
	case "listusers": {
		listUsers(request, response);
		break;
	}
	
	case "addusers":
	{
		addUsersFormLoader(request, response);
		break;
	}
	
	case "updateuser":
	{
		updateFormLoader(request, response);
		break;
	}
	
	case "deleteuser":
	{
		deleteUser(Integer.parseInt(request.getParameter("user_id")));
		listUsers(request, response);
		break;
	}
	
	default:
		errorPage(request, response);
	}
	}


	private void deleteUser(int user_id) {
		new UsersModel().deleteUser(dataSource,user_id);
		
	}


	@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation= request.getParameter("form");
		operation=operation.toLowerCase();
		switch (operation) {
		case "addusersoperation":
		{
			User newUser = new User(request.getParameter("username"), request.getParameter("email"));
			addUserOperation(newUser);
			listUsers(request, response);
			break;
		}
		
		case "updateusersoperation":
		{
			User updatedUser = new User(Integer.parseInt(request.getParameter("user_id")),request.getParameter("username"),request.getParameter("email"));
			updateUserOperation(dataSource,updatedUser);
			listUsers(request, response);
			break;
		}
		default:
			errorPage(request, response);
		}
		}
	
	private void updateUserOperation(DataSource dataSource, User updatedUser) {
		new UsersModel().updateUser(dataSource,updatedUser);
		return;
		
	}


	private void addUserOperation(User newUser) {
		new UsersModel().addUser(dataSource,newUser);
		return;
		
	}

	public void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> listUsers = new ArrayList<>();
		listUsers = new UsersModel().listUsers(dataSource);
		request.setAttribute("listUsers", listUsers);
		request.setAttribute("title", "List Of users");
		request.getRequestDispatcher("listUsers.jsp").forward(request, response);
	}
	
	public void addUsersFormLoader(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("title", "Add Users");
		request.getRequestDispatcher("addUsers.jsp").forward(request, response);
	}
	
	private void updateFormLoader(HttpServletRequest request, HttpServletResponse response) {
		request.setAttribute("title", "Update users");
		try {
			request.getRequestDispatcher("updateUsers.jsp").forward(request, response);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void errorPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("title", "Error Page");
		request.getRequestDispatcher("error.jsp").forward(request, response);
	}

}
