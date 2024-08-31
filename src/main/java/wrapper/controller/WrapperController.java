package wrapper.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WrapperController")
public class WrapperController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("WrapperController :: class loading");
	}

	public WrapperController() {
		System.out.println("WrapperController :: instantiation...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("WrapperController :: initialization...");
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("WrapperController:: WrapperController.doGet()");
		PrintWriter out = response.getWriter();
		
		//customized request :: getParamter(name)
		String name = request.getParameter("name");
		out.println("<h1 style='color:blue; text-align:center;'>ENTERED NAME IS :: " + name + "</h1>");
		
		out.println(" ");
		out.println(" ");
		
		out.print("Output from customized responsewriter");
		out.close();
	}
	
	@Override
	public void destroy() {
		System.out.println("WrapperController :: WrapperController.destroy()");
	}

}
