package com.studyJava;

public class LowPriority 
{

	public static void main(String[] args) 
	{
		MyThreads t1=new MyThreads(1);
		MyThreads t2=new MyThreads(2);
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
	}
}
class MyThreads extends Thread
{
	int id;
	MyThreads(int id)
	{
		this.id=id;
		start();
	}

public void run()
{
	for(int i=0;i<10;i++)
		System.out.println("My id is: "+id);
}
}