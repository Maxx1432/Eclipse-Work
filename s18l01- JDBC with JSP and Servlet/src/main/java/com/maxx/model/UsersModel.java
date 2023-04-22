package com.maxx.model;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.maxx.entity.User;

public class UsersModel {
	public List<User> listUsers(DataSource dataSource) {
		List<User> listUsers = new ArrayList<>();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();

			String qr = "Select * from uses";
			stmt = con.createStatement();

			rs = stmt.executeQuery(qr);

			while (rs.next()) {
				listUsers.add(new User(rs.getInt("user_id"), rs.getString("username"), rs.getString("email")));
			}

		} catch (Exception e) {

		}
		return listUsers;
	}

	public void addUser(DataSource dataSource, User newUser) {

		Connection con = null;
		PreparedStatement stmt = null;
		String username, email, qr;
		try {
			con = dataSource.getConnection();
			username = newUser.getUsername();
			email = newUser.getEmail();

			qr = "insert into uses (username,email) values (?,?)";

			stmt = con.prepareStatement(qr);
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void updateUser(DataSource dataSource, User updatedUser) {

		Connection con = null;
		PreparedStatement stmt = null;
		String username, email, qr;
		try {
			con = dataSource.getConnection();
			int userId = updatedUser.getUser_id();
			username = updatedUser.getUsername();
			email = updatedUser.getEmail();

			qr = "update uses set username = ?, email = ? where user_id = ? ";

			stmt = con.prepareStatement(qr);
			stmt.setString(1, username);
			stmt.setString(2, email);
			stmt.setInt(3, userId);
			stmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteUser(DataSource dataSource, int user_id) {
		Connection con = null;
		PreparedStatement stmt = null;
		String qr;
		try {
			con = dataSource.getConnection();
			qr = "delete from uses where user_id = ? ";
			stmt = con.prepareStatement(qr);
			stmt.setInt(1, user_id);
			stmt.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
