package com.studyJava;

public class Test1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name1="Susan Jain";
		String name2="Karishma Kaiz";
		String name3;
		System.out.println(name1.equals(name2));
		System.out.println(name1.charAt(3));/*letter at third index of first name*/
		System.out.println(name1.concat(name2));
		System.out.println(name1.indexOf('s'));/*index of letter 's'*/
		System.out.println(name1.indexOf('S'));/*index of letter 'S'*/
		System.out.println(name1.lastIndexOf('a'));
		System.out.println(name1.length());
		System.out.println(name1.replace("Jain","Susan"));
		name3=name1+name2;/*new memory allocated*/
		System.out.println(name3);
		
		StringBuffer name4=new StringBuffer("Susan Jain");
		System.out.println(name4.append("Karian"));/*new memory not allocated*/
	}
}