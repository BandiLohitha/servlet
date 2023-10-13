package com.org;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/serv1")
public class Servlet1 implements Servlet{
	
	static
	{
		System.out.println("class loading of serv1");
	}
	{
		System.out.println("object creation of serv1");
	}

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		System.out.println("init method of serv1");
	}

	@Override
	public ServletConfig getServletConfig()
	{
		
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
	{
		
		System.out.println("service method of serv1");
		
	}

	@Override
	public String getServletInfo()
	{
		return null;
	}

	@Override
	public void destroy()
	{
	System.out.println("destroy method of serv1");	
		
	}

}
