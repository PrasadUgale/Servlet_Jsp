package Session_Cookies;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ShowHeaders")
public class ShowHeaders extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		//Printing all Headers information from request
		Enumeration<String> headerNames = request.getHeaderNames();
		out.println("<h1 style='color:red; text-align:center;'>REQUEST HEADER INFORMATION</h1>");
		out.println("<table align='center' border='1'>");
		out.println("<tr><th>HEADERNAME</th><th>HEADERVALUE</th></tr>");
		while (headerNames.hasMoreElements()) {
			out.println("<tr>");
			String headerName = (String) headerNames.nextElement();
			Object headerValue = request.getHeader(headerName);
			out.println("<td>" + headerName + "</td>");
			out.println("<td>" + headerValue + "</td>");
			out.println("</tr>");
		}
		out.println("</table><br><br>");	

		
		//Extracting all attributes from session
		HttpSession session = request.getSession(false);
		if (session == null) {
			out.println("<h1 style='color:red; text-align:center;'>NO SESSION INFORMATION IS AVAILABLE</h1>");
		} else {
			Enumeration<String> attributeNames = session.getAttributeNames();
			out.println("<h1 style='color:red; text-align:center;'>SESION INFORMATION</h1>");
			out.println("<table align='center' border='1'>");
			out.println("<tr><th>ATTRIBUTENAME</th><th>ATTRIBUTEVALUE</th></tr>");
			while (attributeNames.hasMoreElements()) {
				out.println("<tr>");
				String attributeName = (String) attributeNames.nextElement();
				Object value = session.getAttribute(attributeName);

				out.println("<td>" + attributeName + "</td>");
				out.println("<td>" + value + "</td>");

				out.println("</tr>");
			}
			out.println("</table>");
		}
		
		
		//Extracting cookie information
		Cookie[] cookies = request.getCookies();
			
		if (cookies==null) {
				out.println("<h1 style='color:red; text-align:center;'>NO COOKIES ARE ASSOICATED WITH REQUEST OBJECT</h1>");
			
		} else {
				out.println("<h1 style='color:green; text-align:center;'>COOKIE INFORMATION</h1>");
				out.println("<table border='1' align='center'>");
				out.println("<tr><th>COOKIENAME</th><th>COOKIEVALUE</th></tr>");
				for (Cookie cookie : cookies) {
					out.println("<tr>");
					String Cookiename = cookie.getName();
					String Cookievalue = cookie.getValue();
					out.println("<td>"+Cookiename+"</td>");
					out.println("<td>"+Cookievalue+"</td>");
					out.println("</tr>");
				}
				out.println("</table>");
			}
			
			out.close();
		}
}
