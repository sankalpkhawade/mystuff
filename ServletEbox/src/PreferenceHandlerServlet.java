
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PreferenceHandler")
public class PreferenceHandlerServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		User user = (User) session.getAttribute("user");

		
		user.setPreference(request.getParameter("preference")!=null);
		
		session.setAttribute("user", user);
		
		RequestDispatcher rd = request.getRequestDispatcher("personal-info.jsp");
		rd.forward(request, response);

	}

}
