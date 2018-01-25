
package Test;

import org.hibernate.cfg.Configuration;

public class Client {
    
    public static void main(String[]args) throws InterruptedException
    {
        Configuration cfg = new Configuration();
        cfg.configure("resources/hibernate.cfg.xml");
        cfg.buildSessionFactory();
        
    }
    
}
