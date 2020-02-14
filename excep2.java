package com.studyJava;

public class excep2 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=10, b=0;
		int c[]=new int[5];
	try
	{
		System.out.println(a/b);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
			//c[2]=100;
			//System.out.println(c[7]);
		
	catch(ArrayIndexOutOfBoundsException aie)
	{
		System.out.println(aie);
	}
		
		
	
	System.out.println("After exception");
	}

}
