package com.studyJava;

abstract class Animal1 
{
	abstract void eat();
}
class Tiger extends Animal1
{
	void eat()
	{
		System.out.println("I eat only Non vegetarian");
	}
}
class Goat extends Animal1
{
	void eat()
	{
		System.out.println("I eat only Vegetarian");
	}
}
public class Animal
{
	public static void main(String[] args) 
	{
		Animal1 m;
		m= new Tiger();
		m.eat();
		m=new Goat();
		m.eat();
	}
}

