package org.indranil.Test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.indranil.hibernate.dto.User_Details;


public class MyHibernateImplProject {

    public static void main(String[] args) {
        
        User_Details user = new User_Details();
        user.setUser_Id(1);
        user.setUser_Name("Indranil");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        try
        (Session session = sessionFactory.openSession()) { 
        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();
        session.close();
        }
        catch(HibernateException e) {e.getMessage();}

    }
    
}
