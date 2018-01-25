package Test;

import beans.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectOperation {
    
    public static void main(String[]args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf= cfg.buildSessionFactory();
        Session session= sf.openSession();
        Transaction t = session.beginTransaction();
        
       // Users usr = (Users)session.get(Users.class, 111);
        Users usr = (Users)session.load(Users.class, 111);
        System.out.println(usr.getUid());
        System.out.println(usr.getName());
        System.out.println(usr.getMarks());
        
        t.commit();
        session.close();
        sf.close();
    }
    
}
