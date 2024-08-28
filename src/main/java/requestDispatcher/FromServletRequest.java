package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FromServletRequest")
public class FromServletRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*
		 * url pattern can be given as absolute path (Fully qualified path) or relative path
		 */
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("Content of FromServletRequest :: Before Forward");
		
		RequestDispatcher rd = request.getRequestDispatcher("/LandingPage");
		rd.forward(request, response);

		out.println("Content of FromServletRequest :: After Forward");
		out.println("</html></body>");
		out.close();
	}

}
