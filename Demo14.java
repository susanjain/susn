/*Write a program to find the factorial of a number using recursion.*/
package com.studyJava;

import java.util.Scanner;

public class Demo14 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= scn.nextInt();
		double factorial=factnum(num);
		System.out.println("Factorial of " +num+ " is "+factorial);
		
	}

	private static double factnum(int num) 
	{
		// TODO Auto-generated method stub
		if(num>=1)
			return num*factnum(num-1);
		else
			return 1;
	}

}
