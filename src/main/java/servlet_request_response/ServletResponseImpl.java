package servlet_request_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletResponseImpl")
public class ServletResponseImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Usage of Servlet Resoponse Object</h1>");
		out.println("<br>");
		
		out.println("<br>Writing the response");
		out.println("<br>Stream Response :: response.getWriter returns Printwriter Object");
		out.println("<br>Binary Response :: response.getOutputStream() return ServletOutputStream Object");
		out.println("<br>");
		
		out.println("<br>Setting the content type/length/encoding/Header");
		out.println("<br>setContentLength()");
		out.println("<br>setContentLengthLong()");
		out.println("<br>setContentType()");
		out.println("<br>setCharacterEncoding()");
		out.println("<br>setHeader(\"Headername\",\"value\")");
		out.println("<br>");
		
		out.println("<br>Redirect the response");
		out.println("<br>response.sendRedirect(\"./ServletRequestImpl\")"  );
		out.println("<br>OR");
		out.println("<br>response.setStatus(302);");
		out.println("<br>response.setHeader(\"Location\", \"/ServletRequestImpl\");");
		
		out.println("</body>");
		out.println("</html>");
		
	}

}
