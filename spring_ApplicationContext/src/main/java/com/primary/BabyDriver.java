package com.primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BabyDriver {
 public static void main(String[] args) {
	ApplicationContext ac=new AnnotationConfigApplicationContext(Configure.class);
	Wanila w=(Wanila)ac.getBean("wanila");
	w.m2();
}
}
