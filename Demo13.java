/*Write a program to store N elements in an array of integer. Display the elements. 
Accept a number to be searched. 
Display whether the number is found or not in the array (LINEAR SEARCH).*/
package com.studyJava;
import java.util.Scanner;
public class Demo13 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,num,k=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n= scn.nextInt();
		
		int a[] = new int[n];
		System.out.println("Enter the elements of array");
		for(i=0;i<n;i++)
			a[i]=scn.nextInt();
		
		System.out.println("The elements of array are");
		for(i=0;i<n;i++)
			System.out.println(a[i]);
		
		System.out.println("Enter element to be searched");
		num= scn.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==num)
				k++;
		}
		if(k==1)
			System.out.println("Element is found");
		else
			System.out.println("Element is not found");	
		
	}

}
