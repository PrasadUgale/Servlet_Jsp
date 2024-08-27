package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletImpl implements Servlet{
	
	/*
	 * Servlet Lifecycle
	 * 1. Servlet Loading : class is loaded
	 * 2. Servlet Intstantiation : object is created
	 * 3. Servlet Initialization : init() method called
	 * 4. service() method invoked
	 * 5. destroy() method invoked
	 */
	
	static {
		System.out.println("ServletImpl :: Class loading...");
	}
	
	public ServletImpl() {
		System.out.println("ServletImpl :: Object created...");
	}

	@Override
	public void destroy() {
		System.out.println("ServletImpl :: destroy() method called");
	}

	@Override
	public ServletConfig getServletConfig() {
		System.out.println("ServletImpl :: getServletConfig() method called");
		return null;
	}

	@Override
	public String getServletInfo() {
		System.out.println("ServletImpl :: getServletInfo() method called");
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("ServletImpl :: init(ServletConfig) method called");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("ServletImpl :: service() method called");
		res.setContentType("text/html");
		
		PrintWriter out = res.getWriter();
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Implementation of Servlet Interface</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
	

}
