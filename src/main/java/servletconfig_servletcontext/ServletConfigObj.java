package servletconfig_servletcontext;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ServletConfigObj", initParams = {
		@WebInitParam(name = "initParam", value = "initValue", description = "initparam through annotation")
		})
public class ServletConfigObj extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/*
	 * Getting ServletConfig method by overriding init() method
	 */
	private ServletConfig config;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		this.config = config;
	}
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<body align='center' bgcolor='cyan'>");
		out.println("<h1 style='text-align:center;'>ServletConfig DATA::" + getServletConfig() + "</h1>");
		out.println("<br>1. Perticular Servlet required Data");
		out.println("<br>2. Local Scope");
		out.println("<br>3. Configuration through XML or Annotation");
		out.println("<br>");
		
		/*
		 * get config object using getServletConfig()
		 * ServletConfig config = getServletConfig();
		 */
		
		out.println("<br> obtained by getServletConfig() or through init(ServletConfig config) method");
		out.println("<br>");
		
		out.println("<table border='1' align='center'>");
		out.println("<tr><th>PARAMETERNAME</th><th>PARAMETERVALUE</th></tr>");

		Enumeration<String> parameterNames = config.getInitParameterNames();

		while (parameterNames.hasMoreElements()) {
			out.println("<tr>");

			String parameterName = (String) parameterNames.nextElement();
			Object parameterValue = config.getInitParameter(parameterName);
			out.println("<td>" + parameterName + "</td>");
			out.println("<td>" + parameterValue + "</td>");

			out.println("</tr>");
		}
		out.println("</table>");
		
		out.println("</br>");
		out.println("</br>Parameter:");
		out.println("</br>1. Read Only");
		out.println("</br>2. Both key value are String");
		out.println("</br>3. Deployment Time Constant");
		out.println("</br>4. typecasting is not needed while retrieval");
		
		out.println("</br>");
		out.println("</br>Attribute:");
		out.println("</br>1. Can get & set Attributes as required");
		out.println("</br>2. Key is always string, value can be object");
		out.println("</br>3. not deploy time constant");
		out.println("</br>4. Typecasting required at time of retrieval");
		
		out.println("</body>");
		out.close();
	}

}
