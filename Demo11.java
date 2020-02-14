/*Write a program to generate the following series:
1, -2, 3, -4, 5, -6, … N*/
package com.studyJava;
import java.util.Scanner;
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Enter a limit");
		Scanner scn=new Scanner(System.in);
		int x= scn.nextInt();
		for(i=1;i<=x;i++)
		{
			if(i%2!=0)
				System.out.println(+i);
			else
				System.out.println(-1*+i);
		}

	}

}
