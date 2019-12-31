package com.iclique.crudfull.userDAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class AdminDAO {
	static String jdbcURL = "jdbc:mysql://localhost:3306/crud_operation";
	static String jdbcUsername = "admin";
	static String jdbcPass = "admin";
	static Connection jdbcConnection;
	
	
	public static void connection() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");
		jdbcConnection = DriverManager.getConnection(jdbcURL , jdbcUsername, jdbcPass);
	}

	public static boolean checkAdmin(String admin_name, String admin_pass) throws ClassNotFoundException, SQLException {
		String sql = "SELECT * FROM admin WHERE admin_name =? AND admin_pass =?";
		connection();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, admin_name);
		statement.setString(2, admin_pass);
		ResultSet result = statement.executeQuery();
		if(result.next()) {
			return true;
		} else {
			return false;
		}
	}
	
}
