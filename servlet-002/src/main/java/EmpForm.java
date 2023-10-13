import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmpForm extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String ename=req.getParameter("n");
		String sal=req.getParameter("s");
		String deptNo=req.getParameter("d");
		
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptNo);
	}

}
