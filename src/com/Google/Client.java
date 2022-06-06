package com.Google;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Client {

	public static void main(String[] args) {
		
		
		Configuration  cfg = new Configuration();
		//hiernate dfg file will be called
		//heibernate class will be load 
		cfg.configure();
		cfg.addAnnotatedClass(empolyee.class);
		//cfg.addAnnotatedClass(empolyee.class);
		SessionFactory factory =cfg.buildSessionFactory();
		System.out.println(factory);
		 ///get one connection from connection  factory
		Session session =factory.openSession();
		System.out.println("jj");
	empolyee em=	session.load(empolyee.class, 2);
	System.out.println(em);	
		
		
		
		
	}
	
	
}
