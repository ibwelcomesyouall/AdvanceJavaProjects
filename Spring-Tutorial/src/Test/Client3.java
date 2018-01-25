package Test;

import beans.SetterDI_forSecondary_datatypes_Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client3 {
    
    public static void main(String[]args)
    {
        ApplicationContext ab = new ClassPathXmlApplicationContext("resources/spring3.xml");
        SetterDI_forSecondary_datatypes_Car sdic =(SetterDI_forSecondary_datatypes_Car)ab.getBean("sdic");
        sdic.printcarDetails();
    }
    
}
