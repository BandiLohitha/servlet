package com.org;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.*;

@Controller
public class EmployeeController {

	@RequestMapping("/load")
	public ModelAndView loadEmp()
	{
		 Employee e=new Employee();
		e.setEid(101);
		e.setEname("MILLER");
	   	e.setEsal(1250);
		
		ModelAndView mav=new ModelAndView("emp");
		mav.addObject("emp",e);
		return mav;
	}
	
	@RequestMapping("/read")
	public ModelAndView getEmp()
	{
		 Employee e1=new Employee();
		e1.setEid(101);
		e1.setEname("MILLER");
	   	e1.setEsal(800);
	   	
	    Employee e2=new Employee();
		e2.setEid(103);
		e2.setEname("Lohi");
	   	e2.setEsal(1850);
	   	
	    Employee e3=new Employee();
		e3.setEid(104);
		e3.setEname("MIL");
	   	e3.setEsal(3000);
               
	   	List<Employee> employee=new ArrayList<Employee>();
	   	employee.add(e1);
	   	employee.add(e2);
	   	employee.add(e3);
		
		ModelAndView mav=new ModelAndView("display");
		mav.addObject("emps",employee);
		return mav;
	}

}
