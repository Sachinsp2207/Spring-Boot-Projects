package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PersonDriver {
public static void main(String[] args) {
		
		ClassPathResource cpr= new ClassPathResource("Demo.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);	
		Person p=(Person)bf.getBean("person"); 
		p.dispPerson();
		Pan p1=p.getP();
		p1.generated();
	}
}
