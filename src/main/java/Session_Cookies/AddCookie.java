package Session_Cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String value = request.getParameter("value");

		if(name != null && value != null) {
			Cookie c1 = new Cookie(name, value);
			
			// cookie available only for 30 seconds
			c1.setMaxAge(30);
			
			response.addCookie(c1);
			
			out.print("<h1>New Cookie added</h1>");
		} else {
			out.print("<h1>Please provide proper key and value for cookie</h1>");
		}
		out.close();
	}

}
