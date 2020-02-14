/*Write a program to find the sum of all the prime numbers in the range n to m.
 * Display each prime number and also the final sum.*/
package com.studyJava;

import java.util.Scanner;

public class Demo12 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=0,j,k=0,l;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter lower limit");
		int n= scn.nextInt();
		System.out.println("Enter upper limit");
		int m= scn.nextInt();
		if(n==0||n==1)
		System.out.println("Zero and one are not prime numbers");	
		else
		{
		System.out.println("Prime numbers between "+n+ " and "+m+" are ");
		for(l=n;l<=m;l++)
		{ j=0;
			for(i=1;i<=l;i++)
			{
				if(l%i==0)
					j++;	
			}
			if(j==2)
			{
				k=k+l;
				System.out.println(+l);
			}
		}
		
		 System.out.println("Sum of prime numbers between "+n+ " and "+m+" are "+k);
		}

	}
}