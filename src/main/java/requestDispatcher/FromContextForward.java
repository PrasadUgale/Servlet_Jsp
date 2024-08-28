package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FromContextForward")
public class FromContextForward extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Get request dispatcher using context object. Only relative path is given as url pattern.
		 * If we want to forward outside application(other application), we need to enabel crossContext communication
		 * for that we need to add <Context crossContext = "true"> in servers context.xml
		 */
		
		PrintWriter out = response.getWriter();
		out.println("Content of FromContextForward :: Before Forward");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/LandingPage");
		rd.forward(request, response);	
		
		out.println("Content of FromContextForward :: After Forward");
		out.close();	
	}

}
