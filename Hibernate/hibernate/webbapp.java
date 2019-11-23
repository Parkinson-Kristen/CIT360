package webbcalendar.java.hibernate;

import webbcalendar.java.hibernate.Session;

import java.io.PrintStream;

import webbcalendar.java.hibernate.SessionFactory;
import webbcalendar.java.hibernate.cfg.Configuration;
import webbcalendar.java.hibernate.entity.Users;

public class webbapp {
	
	public static void addNew()
	{
		SessionFactory factory = ((Object) new Configuration()
				.configure("hibernate.cfg.xml"))
				.addAnnotatedClass(familyUsers.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
		
		familyUsers user = new familyUsers("kjp", "lm9304of", "Kris", "Webb");  

		
		session.beginTransaction();
		
		session.save(user);  
		user = session.get(familyUsers.class, 0);
		
		
		
		((PrintStream) session).flush();
		
		((Object) session.getTransaction()).commit();
		System.out.println("Row added!");
		
		System.out.println(user);			
		
		
		} finally {
		
		session.close();
		factory.close();
		}

		
	}
	public static void edit()
	{
		SessionFactory factory = ((Object) new Configuration()
				.configure("hibernate.cfg.xml"))
				.addAnnotatedClass(familyUsers.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
		
		familyUsers user = new familyUsers();   
		
		session.beginTransaction();
		
		
		user = session.get(familyUsers.class, 10);
		
		user.setUsername("admin@admin.com");
		
		session.flush();
		
		session.getTransaction().commit();
		System.out.println("Row edited!");
		
		System.out.println(user);			
		
		
		} finally {
		
		session.close();
		factory.close();
		}

		
	}
	public static void delete()
	{
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Users.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
		
		
		familyUsers user = new familyUsers();   
		
		session.beginTransaction();
		
		
		
		user = session.get(familyUsers.class, 9);
		
		session.delete(user);
		
		
		
		session.flush();
		
		session.getTransaction().commit();
		System.out.println("Row deleted!");
		
		System.out.println(user);			
		
		
		} finally {
		
		session.close();
		factory.close();
		}

		
	}
	
	
	
	public static void main(String[] args)
	{
	
		edit();
		addNew();
		delete();
	}
}