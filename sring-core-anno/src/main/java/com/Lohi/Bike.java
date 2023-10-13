package com.Lohi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component(value="b")
public class Bike {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext();
	}
}
