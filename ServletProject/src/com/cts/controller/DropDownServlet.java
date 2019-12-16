package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dropDownServlet")
public class DropDownServlet extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String state = request.getParameter("state");
		RequestDispatcher dispatcher;
		if (state.equals("maharashtra")) {
			dispatcher = request.getRequestDispatcher("DropDown.html");
			dispatcher.include(request, response);
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<label>");
			out.println("District");
			out.println("</label>");
			out.println("<select>");
			out.println("<option>");
			out.println("pune");
			out.println("</option>");
			out.println("<option>");
			out.println("Mumbai");
			out.println("</option>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		} else if (state.equals("telangana")) {
			dispatcher = request.getRequestDispatcher("DropDown.html");
			dispatcher.include(request, response);
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<select>");
			out.println("<option>");
			out.println("Hyderabad");
			out.println("</option>");
			out.println("<option>");
			out.println("Nizamabad");
			out.println("</option>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		} else if (state.equals("delhi")) {
			dispatcher = request.getRequestDispatcher("DropDown.html");
			dispatcher.include(request, response);
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<select>");
			out.println("<option>");
			out.println("New Delhi");
			out.println("</option>");
			out.println("<option>");
			out.println("North West Delhi");
			out.println("</option>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		} else if (state.equals("banglore")) {
			dispatcher = request.getRequestDispatcher("DropDown.html");
			dispatcher.include(request, response);
			out.println("<table>");
			out.println("<tr>");
			out.println("<td>");
			out.println("<select>");
			out.println("<option>");
			out.println("Feni");
			out.println("</option>");
			out.println("<option>");
			out.println("Dhaka");
			out.println("</option>");
			out.println("</td>");
			out.println("</tr>");
			out.println("</table>");
		} else {
			dispatcher = request.getRequestDispatcher("DropDown.html");
			dispatcher.include(request, response);
			out.println("hello");
		}
	}
}
