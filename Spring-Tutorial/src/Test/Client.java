package Test;

import beans.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client
{
public static void main(String args[])
{
//find xml
Resource r = new ClassPathResource("resources/spring.xml");
BeanFactory factory = new XmlBeanFactory(r);
Object o = factory.getBean("t");
Object o1 = factory.getBean("t");
Object o2 = factory.getBean("t");
System.out.println(o==o1);
System.out.println(o1==o2);
Test t = (Test)o;
t.hello();

}
}