package com.org;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetCarData extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String color=req.getParameter("color");
	//double price=Double.parseDouble("price");
		String price=req.getParameter("price");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}

}
