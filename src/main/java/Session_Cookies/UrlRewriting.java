package Session_Cookies;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UrlRewriting")
public class UrlRewriting extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		/*
		 * If cookie is disabled on client side. we will not see JSESSIONID in cookie.
		 * Session management will not be possible with cookie. SO we use url re-writing
		 * Here JSESSIONID will be passed in url
		 */
		
		String uname = request.getParameter("arg");
		
		String url="./UrlRewritingLanding?arg="+uname;
		String encodeURL = response.encodeURL(url);
	
		
		response.sendRedirect(encodeURL);
		
	}

}
