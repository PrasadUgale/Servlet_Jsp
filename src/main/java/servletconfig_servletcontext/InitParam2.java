package servletconfig_servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParam2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Usage of Init Parameter through web.xml</h1>");
		out.println("<br>");
		
		Enumeration<String> paramNames = getInitParameterNames();
		
		while (paramNames.hasMoreElements()) {
			String name = (String) paramNames.nextElement();
			String value = getInitParameter(name);
			out.println("<br> name ::" + name);
			out.println("<br> value :: " + value);
		}
		
		out.println();
		out.close();
	}

}
