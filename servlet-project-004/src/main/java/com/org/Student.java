package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/student")
public class Student extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		

	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet_004","root","root");
	String sql="SELECT * FROM student";
	Statement st=con.createStatement();
	ResultSet rs=st.executeQuery(sql);
	PrintWriter pw=resp.getWriter();
	pw.write("<html><body>");
	pw.write("<table border=2px><tr>");
	pw.write("<th>ID</th>");
	pw.write("<th>NAME</th>");
	pw.write("<th>AGE</th>");
	pw.write("<th>GENDER</th>");
	pw.write("<th>COURSE</th>");
	pw.write("</tr>");
	
	while(rs.next())
	{
	pw.write("<tr>");
	pw.write("<th>"+rs.getInt(1)+"</th>");
	pw.write("<th>"+rs.getString(2)+"</th>");
	pw.write("<th>"+rs.getInt(3)+"</th>");
	pw.write("<th>"+rs.getString(4)+"</th>");
	pw.write("<th>"+rs.getString(5)+"</th>");
	pw.write("</tr>");
	}
		pw.write("</table></body></html>");
	con.close();
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
