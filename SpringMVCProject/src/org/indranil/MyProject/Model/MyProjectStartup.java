package org.indranil.MyProject.Model;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyProjectStartup {

	public  void main(String args) {
		User_Details user = new User_Details();
        //user.setUser_Id(1);
        user.setUser_Name(args);
        user.setAge(18);
        Employee emp = new Employee();
        emp.setUser_Name(args);
        emp.setAge(67);
        		
        		
        
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try
        (Session session = sessionFactory.openSession()) { 
        session.beginTransaction();
        session.save(user);
        session.save(emp);
        session.getTransaction().commit();
        session.close();
        }
        catch(HibernateException e) {e.getMessage();}

	}

}
