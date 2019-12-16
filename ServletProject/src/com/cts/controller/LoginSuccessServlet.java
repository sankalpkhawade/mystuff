package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginSuccessServlet")
public class LoginSuccessServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		Object object = session.getAttribute("username1");
		out.print("<h1>"+"Welcome " + object+"</h1>");
		out.print("<br>");
		out.print("<h3>"+"User has been Successfully Logined."+"</h3>");
		
		String n = request.getParameter("uname");
		out.print("Hello " + n);
		
		//out.print("username2");
	}

}
