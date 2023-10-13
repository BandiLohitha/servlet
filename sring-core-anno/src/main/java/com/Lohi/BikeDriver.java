package com.Lohi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BikeDriver {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		Bike b=ac.getBean("b",Bike.class);
		System.out.println(b);
	}
	
}
