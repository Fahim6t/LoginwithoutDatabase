package com.fahimProject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class LoginWODB extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
	PrintWriter out = res.getWriter();
	String user = req.getParameter("uname");
	String password = req.getParameter("pword");
	if(user.equals("Fahim6t") && password.equals("Fahim@ece")) {
		out.println("Welcome "+user);
	}
	else {
		out.println("Invalid Username and Password");
	}
				
	}
}
