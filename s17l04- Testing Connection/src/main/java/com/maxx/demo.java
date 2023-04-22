package com.maxx;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class demo
 */
@WebServlet("/demo")
public class demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name="jdbc/project")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	PrintWriter out = response.getWriter();
	Connection con = null;
	Statement stmt=null;
	ResultSet rs = null;
	try {
		con= dataSource.getConnection();
		
		String qr = "Select * from uses";
		stmt = con.createStatement();
		
		rs=stmt.executeQuery(qr);
		
		while(rs.next()) {
			out.print("<br>"+rs.getString("email"));
		}			
		
	}catch (Exception e) {
		out.print(e);
	}
	}

}
