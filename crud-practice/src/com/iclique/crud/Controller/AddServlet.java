package com.iclique.crud.Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iclique.crud.DAO.UserDAO;
import com.iclique.crud.model.User;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserDAO userDao;

	public void init() {
		

		userDao = new UserDAO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		try {
			switch(action) {
			case "new" :
				insertUser(request, response);
		}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String country = request.getParameter("country");
		
		User user = new User(name, email, country);
		userDao.insertUSER(user);
		System.out.println("Data passed into model");
		response.sendRedirect("home.jsp");
		
	}

	public void listUsers(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException, ClassNotFoundException {
		List<User> listusers = UserDAO.listAllUsers();
		request.setAttribute("listUsers", listusers);
		RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		rd.forward(request, response);

	}

}
