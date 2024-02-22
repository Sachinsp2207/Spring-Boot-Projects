package spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {
	public static void main(String[] args) {
		
		ClassPathResource cpr= new ClassPathResource("Demo.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);	
		//bean iD  considered  
		//.--acces xml file  
		//---seach for class path 
		//--create object 
//		Pen p= (Pen)bf.getBean("myPen"); 
//		System.out.println(p.getId());
//		System.out.println(p.getBrand());
//		System.out.println(p.getPrice());
//		p.penDetails();
		Company c=(Company)bf.getBean("myComp"); 
		c.showCompany();
	}
}
