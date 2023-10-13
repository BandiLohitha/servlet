package com.Lohi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DonkeyDriver {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Donkey d=(Donkey) ac.getBean("d");
		System.out.println(d);
		
		Donkey d2=(Donkey) ac.getBean("d");
		System.out.println(d2);
	}
}
