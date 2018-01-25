package Test;

import beans.ConstructorDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client2 {
    
    public static void main(String [] args)
    {
        ApplicationContext ap =new ClassPathXmlApplicationContext("resources/spring2.xml");
        ConstructorDI cdi = (ConstructorDI)ap.getBean("cdi");
        cdi.printData();
    }
       
}
