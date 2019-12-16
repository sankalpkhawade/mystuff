package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter("/FilterServlet1")
public class FilterServlet1 implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("----------Before Filter----------"+"<br>");
		chain.doFilter(request, response);
		out.print("<br>"+"----------After Filter----------");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
