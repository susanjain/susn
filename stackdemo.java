package com.studyJava;
import java.util.*;
public class stackdemo 
{

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		
		s.push("Susan Jain");
		s.push("Elena Paul");
		s.push("Karishma Kaiz");
		s.push("Dawny Joy");
		s.push("Akhil MS");
		
		System.out.println("stack elements:"+s);
		System.out.println("first element:"+s.peek());
		System.out.println("stack elements:"+s);
		System.out.println("popping out:"+s.pop());
		System.out.println("stack elements:"+s);
		
		s.push("java");
		System.out.println("after adding:"+s);
		System.out.println("popping out:"+s.pop());
		
		System.out.println("stack elements:"+s);
		System.out.println("first element:"+s.peek());
		
		Enumeration e=s.elements();
		System.out.println("elements are:");
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}

	}

}
