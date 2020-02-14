package com.studyJava;
class sample
{
	int x=100;
	sample()
	{
		System.out.println("A");
	}
}
class sample1 extends sample
{
	sample1()
	{
		System.out.println("B");
	}
}
public class Example 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		sample1 obj = new sample1();
	}

}
