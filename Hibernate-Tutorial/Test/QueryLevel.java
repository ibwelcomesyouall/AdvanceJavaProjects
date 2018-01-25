package Test;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class QueryLevel {
    
    public static void main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate-sessionfactory.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session = sf.openSession();
        
        System.out.println("For first Query ...");
        Query q= session.createQuery("select name from Student");
        q.setCacheable(true);
        List<String> list = q.list();
        for(String name:list)
        {
            System.out.println(name);
        }
        
        System.out.println("For Second Query ...");
        Query q1= session.createQuery("select name from Student");
        q1.setCacheable(true);
        List<String> list1 = q1.list();
        for(String name:list1)
        {
            System.out.println(name);
        }
        
        System.out.println("For Third Query ...");
        Query q2= session.createQuery("select name from Student");
        q2.setCacheable(true);
        List<String> list2 = q2.list();
        for(String name:list2)
        {
            System.out.println(name);
        }
        sf.close();
    }
    
}
