package servlet_request_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletRequestImpl")
public class ServletRequestImpl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>OUTPUT</title></head>");
		out.println("<body>");
		out.println("<h1 style='color:red; text-align:center;'>Usage of Servlet Request Object</h1>");
		out.println("<br>");
		
		out.println("Retrieve form parameters (RequestLine/RequestBody)");
		out.println("<br>getParameterNames() :: " + request.getParameterNames());
		out.println("<br>getParameterMap() ::" +request.getParameterMap());
		out.println("<br>getParameterValues(\"name\") ::" + request.getParameterValues("name"));
		out.println("<br>getParameter(\"name\") ::" + request.getParameter("name"));
		out.println("<br>getParameter(\"any\") ::" + request.getParameter("any"));
		out.println("<br>");
		
		out.println("<br>Retrieve Header information");
		out.println("<br>getHeaderNames() :: " + request.getHeaderNames());
		out.println("<br>getHeader(\"Request Method\") :: " + request.getHeader("HOST"));
		out.println("<br>getServletPath() :: "+ request.getServletPath());
		out.println("<br>");
		
		out.println("<br>Retrive URL info");
		out.println("<br>getRequestURI() " + request.getRequestURI());
		out.println("<br>getContextPath() :: "+ request.getContextPath());
		out.println("<br>getPathInfo() :: "+ request.getPathInfo());
		out.println("<br>getQueryString() :: "+ request.getQueryString());
		out.println("<br>");
		
		out.println("<br>Retrieve Client/Server information");
		out.println("<br>getAuthType() :: "+ request.getAuthType());
		out.println("<br>getCharacterEncoding() :: "+ request.getCharacterEncoding());
		out.println("<br>getContentLength() :: "+ request.getContentLength());
		out.println("<br>getContentLengthLong() :: "+ request.getContentLengthLong());
		out.println("<br>getContentType() :: "+ request.getContentType());
		out.println("<br>getLocalAddr() :: "+ request.getLocalAddr());
		out.println("<br>getLocalName() :: "+ request.getLocalName());
		out.println("<br>getLocalPort() :: "+ request.getLocalPort());
		out.println("<br>getMethod() :: "+ request.getMethod());
		out.println("<br>getPathTranslated() :: "+ request.getPathTranslated());
		out.println("<br>getProtocol() :: "+ request.getProtocol());
		out.println("<br>getRemoteAddr() :: "+ request.getRemoteAddr());
		out.println("<br>getRemoteHost() :: "+ request.getRemoteHost());
		out.println("<br>getRemotePort() :: "+ request.getRemotePort());
		out.println("<br>getRemoteUser() :: "+ request.getRemoteUser());
		out.println("<br>getRequestedSessionId() :: "+ request.getRequestedSessionId());
		out.println("<br>getServerName() :: "+ request.getServerName());
		out.println("<br>getServerPort() :: "+ request.getServerPort());
		out.println("<br>getScheme() :: "+ request.getScheme());
		 
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
