package com.studyJava;
import java.util.*;
public class linklist 
{

	public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add(4);
		l1.add(2);
		l1.add(1);
		l1.add(3);
		System.out.println(l1);
		l1.addFirst(0);
		System.out.println(l1);
		l1.addLast(10);
		System.out.println(l1);
		
		ListIterator li=l1.listIterator();
		int counter=0;
		while(li.hasNext())
		{
			System.out.println("Element["+counter+"]="+li.next());
			System.out.println("-hasPrevious="+li.hasPrevious());
			System.out.println("-hasNext="+li.hasNext());
			System.out.println("-previousIndex="+li.previousIndex());
			System.out.println("-nextIndex="+li.nextIndex());
			System.out.println();
			counter++;
			
		}
	 }

}
