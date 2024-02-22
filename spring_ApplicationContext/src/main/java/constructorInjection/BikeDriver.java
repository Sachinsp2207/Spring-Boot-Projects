package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//Annotaton Configuration Application Context
public class BikeDriver {
	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Configure.class);
		Bike b=(Bike)ac.getBean("bike");
		b.start();
	}
	
	
}
