package com.te.final_mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Register extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			PrintWriter out = resp.getWriter();
			out.println("<h1>Enter the Details</h1>");
			out.println("<form action=./push method='post'>"
					+"<label>Id</label><br>"
					+ "<input type='text' name='id'<br><br><br>"
					+ "<label>Username</label><br>"
					+ "<input type='text' name='username'<br><br><br>"
					+ "<label>Password</label><br>"
					+ "<input type='password' name='password'><br><br>"
					+ "<input type='submit' value='Submit'>"
					+ "</form>" );
		}
}
