package constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeDriver {
public static void main(String[] args) {
	ApplicationContext ac= new AnnotationConfigApplicationContext(Configure.class);
	Life l=(Life)ac.getBean("life");
	System.out.println(l.id);
	System.out.println(l.alive);
	Problem p=l.p;
	p.loveProblem();
}

}
