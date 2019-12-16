

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello World!");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uname=request.getParameter("userName");
		System.out.println("Welcome "+uname);
		//out.print("<h1>"+"Hello World!"+"</h1>");
	}

}
