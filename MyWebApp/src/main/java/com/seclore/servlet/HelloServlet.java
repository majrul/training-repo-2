package com.seclore.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//@WebServlet(name = "hello", urlPatterns = "/hi.exe", loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

	public void init() {
		System.out.println("init called..");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet called..");
		
		ServletConfig sCfg = getServletConfig();
		
		ServletContext sCtx = getServletContext();
		PrintWriter out = response.getWriter();
		out.write("<html><body>");
		out.write("<h1>Hello World</h1>");
		out.write("<h2>" + sCtx.getServerInfo() + "</h2>");
		out.write("<h2>" + sCfg.getServletName() + "</h2>");
		out.write("</body></html>");
	}

	public void destroy() {
		System.out.println("destroy called..");
	}
}
