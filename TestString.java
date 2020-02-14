package com.studyJava;
interface MyFunctionalInterface
{
	//A method with no parameter
	public String sayHello(String x);
}
public class TestString 
{

	public static void main(String[] args) 
	{
		//lambda expression
		MyFunctionalInterface msg=(str) ->
		{
			return "str";
		};
	System.out.println(msg.sayHello("tilaka"));
	}

}
