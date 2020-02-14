package com.studyJava;
import java.util.Scanner;
public class Demo15 
{

	public static void main(String a[]) 
	{
		// TODO Auto-generated method stub
		
		int gr=Integer.parseInt(a[0]);
		for(int i=1;i<a.length;i++)
		{
			if(Integer.parseInt(a[i])>gr)
			{
				gr=Integer.parseInt(a[i]);
			}
				
		}
		System.out.println("The greatest value in array is " +gr);

	}

}
