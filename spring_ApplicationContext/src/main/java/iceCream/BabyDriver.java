package iceCream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BabyDriver {
  public static void main(String[] args) {
	ApplicationContext ac= new AnnotationConfigApplicationContext(Confi.class);
	Baby b=(Baby)ac.getBean("baby");
	b.m2();
}
}
