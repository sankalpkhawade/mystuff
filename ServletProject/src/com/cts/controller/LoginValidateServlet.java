package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cts.model.Login;

@WebServlet("/loginValidation")
public class LoginValidateServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		Login login = new Login();
		login.setUsername(username);
		login.setPassword(password);

		// Login Validation Code using RequestDispatcher
		RequestDispatcher dispatcher;
		if (login.getUsername().equals("james") && login.getPassword().equals("java")) {

			HttpSession session = request.getSession();
			session.setAttribute("username1", login.getUsername());
			//session.invalidate();

			Cookie cookie=new Cookie("username2",login.getUsername());
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
			
			//out.print("<a href='LoginSuccessServlet?username3="+login.getUsername()+"'>Next Servlet</a>");
//			dispatcher = request.getRequestDispatcher("LoginSuccessServlet");
//			dispatcher.forward(request, response);
			// response.sendRedirect("LoginSuccessServlet");
			
		
			
			String n = request.getParameter("userName");
			out.print("Welcome " + n);

			// creating form that have invisible textfield
			out.print("<form action='LoginSuccessServlet'>");
			out.print("<input type='hidden' name='uname' value='" + n + "'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");
			
		} else {
			out.print("User Name or Password is invalid.");
			dispatcher = request.getRequestDispatcher("loginPage.html");
			dispatcher.include(request, response);
		}
	}

}
