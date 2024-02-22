package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class VehicleDriver {
	public static void main(String[] args) {
		ApplicationContext ac= new AnnotationConfigApplicationContext(Configure.class);
		TractorDriver td=(TractorDriver)ac.getBean("tractor");
		td.m1();
		}
}
