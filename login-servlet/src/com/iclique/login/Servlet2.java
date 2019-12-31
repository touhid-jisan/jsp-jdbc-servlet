package com.iclique.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		// String username = (String) req.getAttribute("username");
		HttpSession session = req.getSession();
		//String username = session.getParameter();
		
		//out.println("Succesfully loged in"+ username);
		
		
		
		}

}
