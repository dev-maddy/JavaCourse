package com.te.final_mail;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Push extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("username");
		String pass=req.getParameter("password");
		MailClass entity = new MailClass();
		PrintWriter out = resp.getWriter();
		out.println("<h1>Registerd Successfully<h1>");
		entity.setId(id);
		entity.setName(name);
		entity.setPassword(pass);
		EntityManagerFactory fact = Persistence.createEntityManagerFactory("mail_detail");
		EntityManager manager = fact.createEntityManager();
		manager.persist(entity);
		EntityTransaction trans = manager.getTransaction();
		trans.begin();
		trans.commit();
	}
}
