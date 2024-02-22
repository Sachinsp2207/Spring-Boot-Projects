package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PencilDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("Demo.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	
	Pencil pe=(Pencil) bf.getBean("myPencil");	
}
}
