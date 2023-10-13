package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.org.dao.CarCURD;
import com.org.dto.Car;

@Controller
public class CarController {

	@RequestMapping("/done")
	public String saveCar(@ModelAttribute Car c)
	
	{
		CarCURD.saveCar(c);
		return "car.jsp";
	}
}
