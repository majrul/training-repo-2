package com.seclore.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

@WebFilter("/*")
public class HitCounterFilter extends HttpFilter implements Filter {
       
 	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
 		
 		ServletContext sCtx = getServletContext();
 		Integer hitCounter = (Integer) sCtx.getAttribute("hitCounter");
 		if(hitCounter == null)
 			hitCounter = 0;

 		sCtx.setAttribute("hitCounter", ++hitCounter);
 		
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

}
