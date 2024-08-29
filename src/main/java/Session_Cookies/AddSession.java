package Session_Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSession")
public class AddSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		/*
		 * getSession can take an boolean value as input
		 * true : if request is not associated with any session, new Session object created
		 * false : if request is not associated with any session, null is returned
		 */
		HttpSession session = request.getSession();

		if (session.isNew()) {
			out.println("<h1 style='color:red; text-align:center';>New Session got created with the id ::"
					+ session.getId() + "</h1>");
		} else {

			out.println("<h1 style='color:red; text-align:center';>Session is available with session id ::"
					+ session.getId() + "</h1>");
		}

		// 30seconds after which session object expired
		session.setMaxInactiveInterval(30);
		
		RequestDispatcher rd = request.getRequestDispatcher("./index.html");
		rd.forward(request, response);

		out.close();
	}

}
