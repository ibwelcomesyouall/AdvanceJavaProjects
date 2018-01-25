
package Test;

import beans.DependencyIngestion;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client1 {
    public static void main(String [] args)
    {
        Resource r = new ClassPathResource("resources/spring1.xml");
        BeanFactory br = new XmlBeanFactory(r);
        DependencyIngestion di= (DependencyIngestion)br.getBean("di");
        di.sayHello("Indranil");
    }
}
