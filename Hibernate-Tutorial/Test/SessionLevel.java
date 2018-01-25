package Test;

import beans.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionLevel {
    
    public static void main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session session = sf.openSession();
        Session session1 = sf.openSession();
        Student st1=(Student)session.get(Student.class,1);
        System.out.println(st1.getName());
        System.out.println(st1.getEmail());
        Student st2=(Student)session.get(Student.class,1);
        System.out.println(st2.getName());
        System.out.println(st2.getEmail());
        
        Student st3=(Student)session1.get(Student.class,1);
        System.out.println(st3.getName());
        System.out.println(st3.getEmail());
        
    }
    
}
