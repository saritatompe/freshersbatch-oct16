package com.hibernate;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CrudOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Configuration c=new Configuration();
		c.configure(new File("src/hibernate.cfg.xml"));
		SessionFactory sessionFactory = c.buildSessionFactory(); 
		   Session session = sessionFactory.openSession();
	      
		   
		   /* avrgae of sakary 
		    
		    Criteria criteria = session.createCriteria(Employee.class);
		    criteria.setProjection(Projections.avg("salary"));
	        Object avgSalary = criteria.uniqueResult();
	        System.out.println(avgSalary);
	        session.close();
			*/
		   
		
		   /* order by the employee name
		 		 
        Criteria criteria = session.createCriteria(Employee.class);
        criteria.addOrder(Order.asc("salary"));
        List employeeList = criteria.list();
        System.out.println(employeeList);
        session.close();
		 
		 */
		
				
		 // for total salary 
		  
		    Criteria criteria = session.createCriteria(Employee.class);
	        criteria.setProjection(Projections.sum("salary"));
	        Object totalSalary = criteria.uniqueResult();
	        System.out.println(totalSalary);
	        session.close();
		
		
		
		/*  adding entry to database
		 
		 * Session s2=sessionFactory.openSession();
		Transaction tran1=s2.beginTransaction();
		Employee p=new Employee("delhi","saria",200);
		s2.save(p);
		tran1.commit();
		s2.getTransaction().commit();
		s2.close();
		*/
		
		
		/*
		 * insert into database for next time
		 
		Session s1=sessionFactory.openSession();
		Transaction tran=s1.beginTransaction();
		SQLQuery sqlQuery = s1.createSQLQuery("insert into employee_master(id,location,name,salary) values(?,?,?,?)");
		sqlQuery.setParameter(0, 1);
		sqlQuery.setParameter(1, "delhi");
		sqlQuery.setParameter(2, "komal");
		sqlQuery.setParameter(3, 600);
		sqlQuery.executeUpdate();
		tran.commit();
		s1.close();*/
		
		sessionFactory.close();
	
	}

}












/*for employee
===================================================
Configuration c=new Configuration();
c.configure(new File("src/hibernate.cfg.xml"));
SessionFactory sessionfact = c.buildSessionFactory(); 

//create

Session s1=sessionfact.openSession();
Transaction tran=s1.beginTransaction();
Product p=new Product("jhk", 200);
s1.save(p);
s1.getTransaction().commit();
s1.close();

/*	SQLQuery sqlQuery = s1.createSQLQuery("insert into product_master(p_id,name,cost) values(?,?,?)");
sqlQuery.setParameter(0, 1);
sqlQuery.setParameter(1, "sarita");
sqlQuery.setParameter(2, 600);
sqlQuery.executeUpdate();
tran.commit();
s1.close();
sessionfact.close();
//Product p1=new Product("saria", 1200);
//s1.save(p1);

Session s2=sessionfact.openSession();
Query q=s2.createQuery("from Product");
List<Product> pro=q.list();
System.out.println(pro);
s2.close();


Session s3=sessionfact.openSession();
Transaction tran1=s3.beginTransaction();
//Product n=s3.get(Product.class,5l);
Product n=s3.load(Product.class, 10l);  //by load
n.setName("sarita");
s3.update(n);
tran1.commit();
s3.close();

	Session s4=sessionfact.openSession();
Transaction tran2=s4.beginTransaction();
Product n1=s4.get(Product.class, 11l);
s4.delete(n1);
tran2.commit();
s4.close();
*/