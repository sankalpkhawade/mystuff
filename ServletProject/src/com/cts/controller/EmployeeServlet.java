package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.EmployeeModel;

@WebServlet("/employeeRegistration")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmployeeServlet() {
		super();

	}

	public void init() throws ServletException {

		System.out.println("init method is calling");

	}

	public void destroy() {

		System.out.println("destroy method is called when you stop the server");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// STEP-1 : Set the content type
		response.setContentType("text/html");

		// STEP-2 : Create an object of PrintWriter class
		// here out is user defined
		// used to display result on server (browser)
		PrintWriter out = response.getWriter();

		// STEP-3 : Get the parameters of HTML form using request object
		// used to get parameter from HTML form
		String empId = request.getParameter("employeeId");
		int empId1 = Integer.parseInt(empId);
		String empName = request.getParameter("employeeName");
		EmployeeModel model=new EmployeeModel();
		model.setEmployeeId(empId1);
		model.setEmployeeName(empName);
		String empPassword = request.getParameter("password");
		String empSalary = request.getParameter("salary");
		double empSalary1 = Double.parseDouble(empSalary);
		String empEmail = request.getParameter("email");
		String contact1 = request.getParameter("contact");
		long contact2 = Long.parseLong(contact1);
		String empAddress = request.getParameter("address");
		//String gender1 = request.getParameter("gender");
		//boolean gender2=Boolean.parseBoolean(gender1);
		
		// compare selected value

		// STEP-4 : Display the result on server using out object
		// out.print Display on server
		out.print("<table border='1'>");
			out.print("<tr>");
				out.print("<th>");
					out.print("Employee Id");
				out.print("</th>");
				out.print("<th>");
					out.print("Employee Name");
				out.print("</th>");
			out.print("</tr>");
			out.print("<tr>");
				out.print("<td>");
					out.print(model.getEmployeeId());
				out.print("</td>");
				out.print("<td>");
					out.print(model.getEmployeeName());
				out.print("</td>");
			out.print("</tr>");
		out.print("</table>");
		out.print("<br>");
		out.print("Employee Password : " + empPassword);
		out.print("<br>");
		out.print("Employee Salary : " + empSalary1);
		out.print("<br>");
		out.print("Employee Email : " + empEmail);
		out.print("<br>");
		out.print("Employee Contact : " + contact2);
		out.print("<br>");
		out.print("Employee Address : " + empAddress);
		out.print("<br>");
		//out.print("Employee Status : " + gender2);
//		if(gender2==true){
//			out.print("Employee Gender : Male");
//		}else{
//			out.print("Employee Gender : Female");
//		}
	}

}
