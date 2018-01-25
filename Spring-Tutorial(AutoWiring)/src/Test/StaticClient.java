package Test;

import beans.StaticStudent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticClient {
    
    public static void main(String [] args) throws ClassNotFoundException
    {
                        
        ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring_static.xml");
        StaticStudent s = (StaticStudent)ap.getBean("s");
        s.hello();
    }
    
}
