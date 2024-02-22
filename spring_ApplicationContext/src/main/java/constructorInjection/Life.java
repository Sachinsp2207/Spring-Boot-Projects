package constructorInjection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Life {
 int id;
 boolean alive;
 Problem p;

public Life(@Value("1") int id,@Value("true") boolean alive, Problem p) {
	super();
	this.id = id;
	this.alive = alive;
	this.p = p;
}
 
 
}
