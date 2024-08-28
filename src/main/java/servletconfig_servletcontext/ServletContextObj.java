package servletconfig_servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletContextObj")
public class ServletContextObj extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Usage of Servlet Context Object</h1>");
		out.println("<br>");
		
		out.println("<br>1. Project Data");
		out.println("<br>2. Global Scope");
		out.println("<br>3. Configuration through XML");
		out.println("<br>");
		
		ServletContext context = getServletContext();
		out.println("<br> obtained by getServletContext() or config.getServletContext()");
		out.println("<br>");
		
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>PARAMETERNAME</th><th>PARAMETERVALUE</th></tr>");
		Enumeration<String> parameterNames = context.getInitParameterNames();
		while (parameterNames.hasMoreElements()) {
			out.println("<tr>");
			String parameterName = (String) parameterNames.nextElement();
			Object parameterValue = context.getInitParameter(parameterName);
			out.println("<td>" + parameterName + "</td>");
			out.println("<td>" + parameterValue + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		context.setAttribute("DynamicAttribute", "Added in servlet");
		out.println("<br><table border='1' align='center'>");
		out.println("<tr><th>AttributeName</th><th>AttributeValue</th></tr>");
		Enumeration<String> attributeNames = context.getAttributeNames();
		while (attributeNames.hasMoreElements()) {
			out.println("<tr>");
			String attributeName = (String) attributeNames.nextElement();
			Object attributeValue = context.getAttribute(attributeName);
			out.println("<td>" + attributeName + "</td>");
			out.println("<td>" + attributeValue + "</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		
		
		out.println("</body>");
		
		out.close();
	}

}
