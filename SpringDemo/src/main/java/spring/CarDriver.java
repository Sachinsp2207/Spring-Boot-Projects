package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
public static void main(String[] args) {
		
		ClassPathResource cpr= new ClassPathResource("Demo.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);	
		Car c=(Car)bf.getBean("myCar"); 
		c.dispCar();
		Engine e=c.getE();
		e.start();
	}
}
