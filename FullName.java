package com.studyJava;

public class FullName 
{
	public static void main(String s[]) 
	{
		try
		{
			int length=s[0].length()+s[1].length();
			if(length<10)
				return;
			System.out.println("Name length should be less than 20 in total");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Two command line arguments required");
		}
		finally
		{
			System.out.println("Thank you");
		}
	}

}
