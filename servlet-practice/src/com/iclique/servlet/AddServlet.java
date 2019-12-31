package com.iclique.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{
	
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		int i =Integer.parseInt(request.getParameter("text1"));
		
		int j =Integer.parseInt(request.getParameter("text2"));
//		PrintWriter out = response.getWriter();
//		request.setAttribute("k", i+j);
//		
//		RequestDispatcher rd = request.getRequestDispatcher("sq");
//		rd.forward(request, response);
		HttpSession session = request.getSession();
		
	
	}

}
