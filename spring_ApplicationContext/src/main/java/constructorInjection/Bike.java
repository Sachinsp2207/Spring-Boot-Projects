package constructorInjection;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	Bike()
	{
		System.out.println("Bike Created..!!");
	}
	void start()
	{
		System.out.println("Bike IS Started..!!                                                                 ");
	}
}
