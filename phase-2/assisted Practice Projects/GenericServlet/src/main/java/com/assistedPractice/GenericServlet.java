package com.assistedPractice;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class GenericServlet extends HttpServlet {
	public void deGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String fname = req.getParameter("fname");
        String lname = req.getParameter("lname");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.append("Your full name is " + fname + " " + lname);
        out.println("</body></html>");

	}
	

}
