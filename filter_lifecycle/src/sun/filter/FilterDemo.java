package sun.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterDemo implements Filter {
	
	
	public FilterDemo() {
		System.out.println("FilterDemo()");
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init");
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("destroy");

	}

}
