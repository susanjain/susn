package myBean;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Hello extends HttpServlet
{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		//System.out.println("hello");
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		pw.println(s1+""+s2);
		
	}

	
	
}


