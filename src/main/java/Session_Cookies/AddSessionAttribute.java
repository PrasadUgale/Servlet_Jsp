package Session_Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/AddSessionAttribute")
public class AddSessionAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		String name = request.getParameter("name");
		String value = request.getParameter("value");

		if(session == null) {
			out.println("<h1>No session information found to add the attributes</h1>");
		} else if(name == null || value == null) {
			out.println("<h1>Please provide valid name and value to add</h1>");
		} else {
		
			//Can add attributes to current session object
			session.setAttribute(name, value);
			
			out.println("<h1>Attribute Successfully added to session</h1>");
		}
		
		out.close();
	}

}
