package com.studyJava;
import java.util.Scanner;
public class Demo16 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name;
		int mark[]=new int[5];
		int tot=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the name of the student");
		name=scn.next();
		
		for(int i=0;i<mark.length;i++)
		{
			System.out.println("Enter the mark of subject " +(i+1));
			mark[i]=scn.nextInt();
			tot= tot + mark[i];
		}
			
		
		for(int j=0;j<mark.length;j++)
		{
			System.out.println("The mark obtained by " +name+ " for subject " +(j+1)+ " is");
			System.out.println(mark[j]);
		}
		
		System.out.println("The total marks obtained by " +name+ " for five subjects is " +tot);
		
		
		
	}
	

}
