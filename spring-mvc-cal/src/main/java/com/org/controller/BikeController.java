package com.org.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.BikeCURD;
import com.org.dto.Bike;

@Controller
public class BikeController {
	
	@RequestMapping("/save")

	public String saveBike(@ModelAttribute Bike b)
	{
//				System.out.println(b.getBid());
//		System.out.println(b.getBname());
//		System.out.println(b.getPrice());
//		
		BikeCURD.saveBike(b);
		return "bike.jsp";
	}
	
	public ModelAndView getBikes()
	{
		ModelAndView mav=new ModelAndView("displaybikes.jsp");
		List<Bike> bikes=BikeCURD.getBikes();
		mav.addObject("bikes",bikes);
		return mav;
	}
}
