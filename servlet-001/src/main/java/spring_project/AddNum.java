package spring_project;

import java.io.IOException;

import javax.security.sasl.SaslException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddNum extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws ServletException ,IOException {
		
		
			int Num1=Integer,ParseInt(req.getParameter("n1"));
			int Num2=Integer,ParseInt(req.getParameter("n2"));
			req.getWriter().write("<h1>ADD IS: "+(n1+n2)+"</h1>")
	}
	


	
}
