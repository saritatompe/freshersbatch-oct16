package com.hibernate;

import java.io.File;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CrudOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Configuration c=new Configuration();
		c.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionfact = c.buildSessionFactory(); 
		
		//create
		
		Session s1=sessionfact.openSession();
		Product p=new Product("abc", 200);
		//Product p1=new Product("saria", 1200);
		Transaction tran=s1.beginTransaction();
		s1.save(p);
		//s1.save(p1);
		s1.getTransaction().commit();
		s1.close();
		
		
		
		Session s2=sessionfact.openSession();
		Query q=s2.createQuery("from Product");
		List<Product> pro=q.list();
		System.out.println(pro);
		s2.close();
		
		
		Session s3=sessionfact.openSession();
		Transaction tran1=s3.beginTransaction();
		Product n=s3.get(Product.class,5l);
		n.setName("xyz");
		s3.update(n);
		tran1.commit();
		s3.close();
		
		Session s4=sessionfact.openSession();
		Transaction tran2=s4.beginTransaction();
		Product n1=s4.get(Product.class, 11l);
		s4.delete(n1);
		tran2.commit();
		s4.close();
	}

}
