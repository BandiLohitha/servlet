package com.org;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/msg")
  public String getMessage()
  {
	  return "msg.jsp";
  }
	
	@RequestMapping("/sendval")
	public String sendValue(Model m)
	{
		m.addAttribute("val","value sent by the model");
		return "msg.jsp";
	}
	
	@RequestMapping("sendviewmodel")
	public ModelAndView sendViewsModel()
	{
		ModelAndView mav=new ModelAndView();
		mav.setViewName("msg.jsp");
		mav.addObject("val","value sent by the model & view");
		return mav ;
	}
	
	@RequestMapping("emp")
	public String getEmp(@RequestParam int id,@RequestParam String name,@RequestParam double sal)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
		return "employee.jsp";
	}
	
	@RequestMapping("emp1")
	public String getEmp(@ModelAttribute Employee e)
	{
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getSal());
		return "employee.jsp";
	}
}
