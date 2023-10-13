package Setter_injuction;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("perc")
public class Person {
String name;
int age;

@Value("Chaithu")
public void SetName(String name)
{
	this.name=name;
	
}
@Value("13")
public void SetAge(int age)
{
	this.age=age;
}
}
