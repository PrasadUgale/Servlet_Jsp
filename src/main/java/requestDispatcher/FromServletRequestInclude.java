package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FromServletRequestInclude")
public class FromServletRequestInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * url pattern can be given as absolute path or relative path
		 */
		
		RequestDispatcher rd = request.getRequestDispatcher("/LandingPage");
		
		PrintWriter out = response.getWriter();
		out.println("Content of FromServletRequestInclude :: Before Forward");
		
		rd.include(request, response);

		out.println("Content of FromServletRequestInclude :: After Forward");
		out.close();
	}
}
