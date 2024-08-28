package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FromContextInclude")
public class FromContextInclude extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("Content of FromContextInclude :: Before Forward");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/LandingPage");
		rd.include(request, response);
		
		out.println("Content of FromContextInclude :: After Forward");
		out.close();	
	}

}
