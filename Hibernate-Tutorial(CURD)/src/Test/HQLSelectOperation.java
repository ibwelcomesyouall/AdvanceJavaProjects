package Test;

import beans.Users;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLSelectOperation {
    
    public static void main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        /* For single record fetch
        String hql = "select name from Users where id=989";
        Query q = session.createQuery(hql);
        String name=(String)q.uniqueResult();
        System.out.println(name);*/
        
        /*For single row record fetch
        String hql = "from Users where id=989";
        Query q = session.createQuery(hql);
        Users usr = (Users)q.uniqueResult();
        System.out.println(usr.getUid());
        System.out.println(usr.getName());
        System.out.println(usr.getMarks());*/
        
        /*For single row record fetch
        String hql = "select name from Users";
        Query q = session.createQuery(hql);
        List<String> list = q.list();
        for (String name:list)
        {
            System.out.println(name);
        }*/
        
        //For single row record fetch
        String hql = "select name,marks from Users";
        Query q = session.createQuery(hql);
        List<Object> list = q.list();
        for (Object obj:list)
        {
            Object arg[]=(Object[])obj;
            System.out.println(arg[0]);
            System.out.println(arg[1]);
            
        }
        
        
        session.close();
        sf.close();
    }
    
}
