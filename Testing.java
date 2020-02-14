package com.studyJava;


class X implements B
{
	public void met1()
	{
		System.out.println("one");
	}
	public void met2()
	{
		System.out.println("two");
	}
	public void met3()
	{
		System.out.println("three");
	}
}
public class Testing
{
	public static void main(String[] args)
	{
	B a=new X();
	a.met1();
	a.met2();
	a.met3();
	}
}


