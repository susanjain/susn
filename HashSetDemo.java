package com.studyJava;
import java.util.*;
public class HashSetDemo 
{

	public static void main(String[] args)
	{
		
		Set hs=new HashSet();
		hs.add("Susan");
		hs.add("Karishma");
		hs.add("Elena");
		hs.add("Dawny");
		hs.add("Akhil");
		hs.add("Karishma");
		hs.add("Dawny");
		hs.add(null);
		System.out.println(hs);
		TreeSet l=new TreeSet();
		l.add(30);
		//l.add(null);//null not allowed
		l.add(10);
		l.add(40);
		l.add(30);
		System.out.println(l);
	}

}
