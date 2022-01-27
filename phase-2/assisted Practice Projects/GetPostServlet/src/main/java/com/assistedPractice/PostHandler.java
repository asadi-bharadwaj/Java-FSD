package com.assistedPractice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PostHandler extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String address=req.getParameter("address");
		out.println("name : "+name+"address : "+address);
		out.println("</body></html>");
		
		
	}

}
