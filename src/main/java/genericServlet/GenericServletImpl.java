package genericServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/GenericServletImpl"}, loadOnStartup = 10)
public class GenericServletImpl extends GenericServlet {
	
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("GenericServletImpl :: class loading...");
	}
	
	public GenericServletImpl() {
		System.out.println("GenericServletImpl :: object instanciation...");
	}
	
	@Override
	public void init() {
		System.out.println("GenericServletImpl :: object initialization...");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("GenericServletImpl :: service called...");
		
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Extended GenericServlet</h1>");
		out.println("</body>");
		out.println("</html>");
		out.close();
		
	}

}
