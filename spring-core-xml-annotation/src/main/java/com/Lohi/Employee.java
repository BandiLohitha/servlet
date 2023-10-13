package com.Lohi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("101")
	int id;
	@Value("Lohi")
	String name;
	@Value("200000")
	double sal;
	
}
