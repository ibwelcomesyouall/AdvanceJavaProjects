
package Test;

import beans.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertRecords {
    
    public static void main(String[]args)
    {
        Configuration cf = new Configuration();
                cf.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cf.buildSessionFactory();
        for (int i=0;i<1000;i++)
        {
        Session session = sf.openSession();
        Transaction ts=session.beginTransaction();
        Users usr = new Users();
        usr.setUid(i);
        usr.setName("User"+i);
        usr.setMarks(10+i);
        session.persist(usr);
        ts.commit();
        session.close();
        }
        
        sf.close();
    }
    
}
