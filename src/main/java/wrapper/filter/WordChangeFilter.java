package wrapper.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wrapper.wrapper.CustomizedRequest;
import wrapper.wrapper.CustomizedResponse;

@WebFilter("/WrapperController")
public class WordChangeFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("WordChangeFilterLoading:: WordChangeFilter.enclosing_method()");
	}

	
    public WordChangeFilter() {
       System.out.println("WordChangeFilterInstantiation :: WordChangeFilter.WordChangeFilter()");
    }

	public void destroy() {
		System.out.println("WordChangeFilterDeInstantiation :: WordChangeFilter.destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("WordChangeFilterRequestProcessing :: WordChangeFilter.doFilter()");
		
		//Pass request through CustomizedRequest Wrapper
		CustomizedRequest req = new CustomizedRequest((HttpServletRequest) request);
		
		//Pass response through CustomizedResponse Wrapper
		CustomizedResponse  res = new CustomizedResponse((HttpServletResponse) response);
		
		// pass the request along the filter chain
		chain.doFilter(req, res);
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("WordChangeFilterInitialization :: WordChangeFilter.init()");
	}

}
