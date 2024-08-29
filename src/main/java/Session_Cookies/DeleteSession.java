package Session_Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/DeleteSession")
public class DeleteSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * When we invalidate the session. Session object is destroyed from server side.
		 * but the cookie might still be available from client side. which is of no use.
		 */
		HttpSession session = request.getSession(false);
		
		PrintWriter out = response.getWriter();
		
		if(session == null) {
			out.println("<h1>No Session found to invalidate</h1>");
		} else {
			out.println("<h1>Current session with id : " + session.getId() +" is invalidated.");
			//Session invalidated using .invalidate function
			// We can use .setMaxInactiveInterval to invalidate session automatically after a specific time interval.
			session.invalidate();
		}
		
		out.close();
	}

}
