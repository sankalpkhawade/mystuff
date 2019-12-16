//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet("/DisplayEmployeeServlet")
//public class DisplayEmployeeServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//	public void doPost(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//
//		response.setContentType("text/html");
//		Employee e1 = new Employee();
//		String id=request.getParameter("id");
//		e1.setId(id);
//		request.getAttribute(id);
//		request.setAttribute("e1", e1);
//		
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("display-details.jsp");
//		dispatcher.forward(request, response);
//	}
//
//}

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

@WebServlet("/DisplayEmployeeServlet")
public class DisplayEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, ParseException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		SimpleDateFormat sd = new SimpleDateFormat();
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String date = request.getParameter("dateOfBirth");
		String fullTime = request.getParameter("fullTimeEmployee");
		String department = request.getParameter("department");
		String salary = request.getParameter("salary");
		try {
			Employee e = new Employee();
			e.setId(id);
			e.setName(name);
			e.setGender(gender);
			Date d = sd.parse(date);
			//e.setDate(d);
			e.setFulltime(fullTime);
			e.setDepartment(department);
			e.setSalary(salary);
		} catch (Exception e) {
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher("Display-Details.jsp");
		dispatcher.forward(request, response);
		// out.print("hello");

	}

}
