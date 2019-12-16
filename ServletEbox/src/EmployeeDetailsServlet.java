import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmployeeDetailsServlet")
public class EmployeeDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Employee e = new Employee();
		e.setId("969143");
		e.setName("John");
		e.setGender("Male");
		e.setDate("08/07/1997");
		e.setFulltime("True");
		e.setDepartment("Information Technology");
		e.setSalary("120000");

		request.setAttribute("e", e);
		RequestDispatcher dispatcher = request.getRequestDispatcher("edit-employee.jsp");
		dispatcher.forward(request, response);
	}
}
