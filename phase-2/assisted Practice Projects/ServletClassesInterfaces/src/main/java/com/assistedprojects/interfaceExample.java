package com.assistedprojects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class interfaceExample implements Servlet  {
	ServletConfig config=null;
	public void init(ServletConfig config) {
		this.config=config;
	}
	public void Service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/Html");
        PrintWriter pwriter=res.getWriter();
        pwriter.print("<html>");
        pwriter.print("<body>");
        pwriter.print("In the service() method<br>");
        pwriter.print("</body>");
        pwriter.print("</html>");

		
	}
	
	@Override
	public void destroy() {
		System.out.println("in destroy() method");
		
		
	}
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}
	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "this is a sample servlet info";
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
