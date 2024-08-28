package requestDispatcher;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SendRedirect")
public class SendRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * When sendRedirect is called, the server sends an HTTP response back to the client's browser with a status code of 302 (Found) 
		 * along with the URL to redirect to. The browser then makes a new HTTP request to this URL. 
		 * This means that the client is aware of the redirection, and the URL in the browser's address bar changes.
		 * It can be used to redirect within and outside the server.
		 */
		
		response.sendRedirect("./LandingPage");
	}

}
