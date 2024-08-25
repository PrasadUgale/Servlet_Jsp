package httpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "Working with GET and POST methods", urlPatterns = { "/3" }, loadOnStartup = 10)
public class HttpServletImpl extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("HttpServletImpl :: class loading...");
	}

	public HttpServletImpl() {
		System.out.println("HttpServletImpl :: object instantiation...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("HttpServletImpl :: object initialization...");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HttpServletImpl.doGet()....");
		PrintWriter out = response.getWriter();
		out.println("<h1>RequestProcessing :: GET METHOD...</h1>");
		out.close();
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("HttpServletImpl.doPost()....");
		PrintWriter out = response.getWriter();
		out.println("<h1>RequestProcessing :: POST METHOD...</h1>");
		out.close();
	}
}
