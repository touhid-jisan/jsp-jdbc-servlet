package com.iclique.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet1
 */
public class AddServlet1 extends HttpServlet {
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("username");
		String pass = req.getParameter("password");

//		req.setAttribute("username", name);
		PrintWriter out = res.getWriter();
		if(pass.equals("touhid") && name.equals("jisan")) {
			RequestDispatcher rd = req.getRequestDispatcher("Servlet2");
			rd.forward(req, res);
		} else {
			out.println("Wrong Username or Password");
		}
		
		
		
	}
}
