package Test;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    
    public static void main(String [] args)
    {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
        Car c = (Car)ap.getBean("c");
        c.printData();
    }
    
}
