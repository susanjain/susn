

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Dispatcher extends HttpServlet 
{
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String eno1=request.getParameter("el");
		String name1=request.getParameter("nl");
		String salary1=request.getParameter("sl");
		String dept1=request.getParameter("dl");
		request.setAttribute("Employeenumber",eno1);//attribute name,attribute value
		request.setAttribute("Employeename",name1);
		request.setAttribute("Salary",salary1);
		request.setAttribute("Depart",dept1);
		ServletContext context=getServletContext();
		RequestDispatcher rd=context.getRequestDispatcher("/Dispatcher4");
		rd.include(request,response);	
	}

}
