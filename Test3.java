package com.studyJava;


class A
{
	int x;
	int y;
	
	int get(int p, int q)
	{
		x=p;y=q;return(0);
	}
	
	void show()
	{
		System.out.println(x);
	}
}
	
	
public class Test3 extends A
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Test3 a =new Test3();
		A aa;
		aa=new A();
		aa.show();
		aa= new Test3();
		aa.show();
		//a.get(5,6);
		//a.show();
		//a.display();
	}
	
	//void display()
	void show()
	{
	super.show();
	System.out.println(y);
	}

}


