package com.studyJava;

public class New 
{
	//static int a;
	int a;	
	void disp()
	{
		a++;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
		{
			New se=new New();
			se.disp();
		}
	}
	

}
