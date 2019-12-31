package com.iclique.crud.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.iclique.crud.model.User;

public class UserDAO {
	static String jdbcURL = "jdbc:mysql://localhost:3306/crud_operation";
	static String jdbcUsername = "admin";
	static String jdbcPass = "admin";
	static Connection jdbcConnection;
	
	public UserDAO() {

	}


	public static void connection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPass);
		System.out.println("in connection method check 2");
		if(!jdbcConnection.isClosed()) {
			System.out.println("connected sussessfully");
		} else {
			System.out.println("not connected");
		}
	}
	static void disconnect() throws SQLException {
		jdbcConnection.close();
	}
	
	
	
	public static List<User> listAllUsers() throws SQLException, ClassNotFoundException {
		ArrayList<User> allUsers = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try {
			connection();
			Statement statement = jdbcConnection.createStatement();
			ResultSet resultset = statement.executeQuery(sql);
			while(resultset.next()) {
				int id = resultset.getInt(1);
				String name = resultset.getString(2);
				String email = resultset.getString(3);
				String country = resultset.getString(4);
				
				User user = new User(id, name, email, country);
				allUsers.add(user);
				
			}
			disconnect();
			statement.close();
		} catch (Exception e) {
				System.err.println("Got an exception! ");
				System.err.println(e.getMessage());
		}
		
		
		return allUsers;
	}


	public void insertUSER(User user) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO users(name, email, country) VALUES(?,?,?)";
		connection();
		System.out.println("insertUSER connected successfully");
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, user.getName());   
		statement.setString(2, user.getEmail());
		statement.setString(3, user.getCountry());
		
		boolean rowInserted = statement.executeUpdate() >0;
		if(rowInserted) {
			System.out.println(rowInserted);
		}
		
		
	}


	public static List<User> showAllUser() {
		// TODO Auto-generated method stub
		return null;
	}



}
