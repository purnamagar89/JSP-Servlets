package com.company.filter;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class IPAddressFilter
 */
@WebFilter("/IPAddressFilter")
public class IPAddressFilter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {
		String initParam = fConfig.getInitParameter("init-param"); 

	      //Print the init parameter 
	      System.out.println("Test Param: " + initParam); 
	}
	
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		InetAddress ip = InetAddress.getLocalHost();

	    System.out.println("IP "+ ip + ", Time " + new Date().toString());
		
		chain.doFilter(request, response);
	}

	

}
