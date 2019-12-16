package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//String s=request.getParameter("userName");
		//Config Output
		ServletConfig servletConfig=getServletConfig();
		ServletContext servletContext=getServletContext();
//		String s=servletConfig.getInitParameter("userName3");
//		String p=servletConfig.getInitParameter("password3");
//		String cp=servletConfig.getInitParameter("confirmPassword3");
////		String s1=request.getParameter("password");
////		String s2=request.getParameter("confirmPassword");
//		out.print("Config Output"+"<br>");
//		out.print("User Name: "+s+"<br>");
//		out.print("Password: "+p+"<br>");
//		out.print("Confirmed Password: "+cp+"<br>");
//		
		String uname=servletConfig.getInitParameter("userName");
		String dept=servletContext.getInitParameter("Department");
		out.print("User Name : "+uname+"<br>");
		out.print("Department : "+dept+"<br>");
		
		
//		String s3=servletContext.getInitParameter("userName2");
//		String s4=servletContext.getInitParameter("password2");
//		String s5=servletContext.getInitParameter("confirmPassword2");
////		out.print("Password: "+s1+"<br>");
////		out.print("Confirmed Password: "+s2+"<br>");
//		//Context Output
//		out.print("<br>"+"Context Output"+"<br>");
//		out.print("User Name: "+s3+"<br>");
//		out.print("Password: "+s4+"<br>");
//		out.print("Confirmed Password: "+s5+"<br>");
		
		
	}

}
