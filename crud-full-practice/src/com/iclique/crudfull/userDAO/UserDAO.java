package com.iclique.crudfull.userDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.iclique.crudfull.model.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserDAO {
	static String jdbcURL = "jdbc:mysql://localhost:3306/crud_operation_full";
	static String jdbcUsername = "admin";
	static String jdbcPass = "admin";
	
	static Connection jdbcConnection;

	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public static void connection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		jdbcConnection = DriverManager.getConnection(jdbcURL , jdbcUsername, jdbcPass);
		if(!jdbcConnection.isClosed()) {
			System.out.println("Database Connected");
		} else {
			System.out.println("Database Connection Rejected");
		}
		
	}
	public static void disconnect() throws SQLException {
		jdbcConnection.close();
	}

	public static void inserUserDB(User new_user) throws SQLException, ClassNotFoundException {
		String sql = "INSERT into users (name, email, country, contact, address) VALUES(?,?,?,?,?)";
		connection();
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		//statement.setInt(1, new_user.getId());
		statement.setString(1, new_user.getName());
		statement.setString(2, new_user.getEmail());
		statement.setString(3, new_user.getCountry());
		statement.setInt(4, new_user.getContact());
		statement.setString(5, new_user.getAddress());
		
		boolean rowInserted = statement.executeUpdate() > 0;
		if(rowInserted) {
			System.out.print("data submitted");
			
		} else {
			System.out.println("data not submitted");
		}
		disconnect();
	}
	public static List<User> showAllUser() throws ClassNotFoundException, SQLException {
		List<User> allUser = new ArrayList<>();
		String sql = "SELECT * FROM users";
		connection();
		Statement statement = jdbcConnection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		
		while(result.next()) {
			int id = result.getInt("id");
			String name = result.getString("name");
			String email = result.getString("email");
			String country = result.getString("country");
			int contact = result.getInt("contact");
			String address = result.getString("address");
			
			User user = new User(id, name, email, country, contact, address);
			allUser.add(user);
		}
		disconnect();
		return allUser;
	}

	public static void deleteUserDB(int id) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM users WHERE id=?";
		connection();
		//System.out.println("check2");
		PreparedStatement  statement = jdbcConnection.prepareStatement(sql);	
		//System.out.println("check2");
		statement.setInt(1, id);
		//System.out.println("check2");
		boolean flag = statement.executeUpdate() > 0;
		if(flag) {
			System.out.println(flag);
		} else {
			System.out.println(flag);
		}
		disconnect();
		
	}

	public static User getUser(int id) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM users WHERE id=?";
		connection();
		System.out.println("in get User method" + id);
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		ResultSet result = statement.executeQuery();
		User user = null;
		
		while(result.next()) {
			String name = result.getString("name");
			String email = result.getString("email");
			String country = result.getString("country");
			int contact = result.getInt("contact");
			String address = result.getString("address");
		
			user = new User(id, name, email, country, contact, address);
		}
		System.out.println("in get User method" + id);
		return user;
		
	}

	public static void updateUser(User update_user) throws SQLException {
		// TODO Auto-generated method stub
		String sql = "UPDATE users SET 	name = ?, email= ?, country= ?, contact= ?, address= ? where id= ?";
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		
		//statement.setInt(1, update_user.getId());
		statement.setString(1, update_user.getName());
		
		statement.setString(2, update_user.getEmail());
		statement.setString(3, update_user.getCountry());
		statement.setInt(4, update_user.getContact());
		statement.setString(5, update_user.getAddress());
		statement.setInt(6, update_user.getId());
		System.out.println(update_user.getId() + " "+ update_user.getCountry() + " "+update_user.getContact());
		int rowInserted = statement.executeUpdate();
		if(rowInserted > 0) {
			System.out.println("Data Updated");
		} else {
			System.out.println("Data not updated");
		}
		disconnect();
	}

}
