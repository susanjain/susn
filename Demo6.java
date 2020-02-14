/*Write a program to accept a number and display the last digit of the number in words.*/
package com.studyJava;
import java.util.Scanner;
public class Demo6 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= scn.nextInt();
		int lastdigit= n%10;
		System.out.println("The last digit of " +n+ " is " +lastdigit);
		
		switch(lastdigit)
		{
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Invalid option");
		
		}
	}

}
