
package Test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLInsertOperation {
    public static void main(String [] args)
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();
        String hql="insert into New_User(uid, name, marks) select u.uid,u.name,u.marks from Users u";
        Query q = session.createQuery(hql);
        int i = q.executeUpdate();
        ts.commit();
        System.out.println("Number of rows update = "+i);
        session.close();
        sf.close();
    }
    
}
