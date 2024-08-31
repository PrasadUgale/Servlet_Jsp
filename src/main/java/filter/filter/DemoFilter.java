package filter.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;

/*
 * Mapping configured in web.xml
 */
public class DemoFilter extends HttpFilter implements Filter {
	
	private static final long serialVersionUID = 1L;

	static {
		System.out.println("DemoFilter :: class file is loading...");
	}
       
    public DemoFilter() {
       System.out.println("DemoFilter :: object is instantiated...");
    }

	public void destroy() {
		System.out.println("DemoFilter :: destroy()");
	}

	//This method will be called by container
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("DemoFilter :: doFilter()");
		
		PrintWriter out = response.getWriter();
		out.println("<h1 style='color:red; text-align:center'>ADDED BY FILTER BEFORE PROCESSING REQUEST...</h1>");
		
		//Method need to call by programmer explicitly to pass the request along the filter chain
		chain.doFilter(request, response);
		
		out.println("<h1 style='color:red; text-align:center'>ADDED BY FILTER AFTER PROCESSING REQUEST...</h1>");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("DemoFilter :: initialization...");
	}

}