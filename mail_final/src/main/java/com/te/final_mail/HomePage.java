package com.te.final_mail;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HomePage extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String param = req.getParameter("username");
			EntityManagerFactory fact = Persistence.createEntityManagerFactory("mail_detail");
			EntityManager manager = fact.createEntityManager();
			manager.persist();
			Query query = manager.createQuery("select count(name) from mail_info");
		
	}
}
