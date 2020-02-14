package com.studyJava;
import java.util.Scanner;
public class Test4 
{
	
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of names");
		int n=scn.nextInt();
		Test4 d1[]= new Test4[n];
		System.out.println("Enter the names");
			for(int i=0;i<d1.length;i++)
				d1[i]=new Test4(scn.next());
			
		for(int i=0;i<d1.length;i++)
			System.out.println(d1[i].getName());
	}



	String name;
	Test4(String s)
	{
		name=s;
		
	}
	
	String getName()
	{
		return name;
	}
}
