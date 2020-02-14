package myBean;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
public class InitParam1 extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
{
   PrintWriter out =response.getWriter();
   out.print("<h1>Init Parameters Names are:");
   Enumeration<String> enumeration = getServletConfig().getInitParameterNames();
   while(enumeration.hasMoreElements());
   {
  out.print(enumeration.nextElement()+"");
   }
   ServletConfig con1 = getServletConfig();
   out.println("<h1>Company:"+con1.getInitParameter("Company"));
   out.println("Venue:"+con1.getInitParameter("Venue"));
   out.println("Training:"+con1.getInitParameter("Training"));
   
   out.println("<h1>Company:"+getServletConfig().getInitParameter("Company"));
   out.println("Venue:"+getServletConfig().getInitParameter("Venue"));
   out.println("Training:"+getServletConfig().getInitParameter("Training"));

}

private void While(boolean hasMoreElements)
{


}

}

