package com.primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wanila {
	@Autowired
	IceCream ic;
	
	public void m2()
	{
		ic.eat();
	}
	
}
