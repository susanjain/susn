package com.studyJava;


import java.util.*;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		HashMap hm=new HashMap();
		hm.put("oop","object oriented programming");
		hm.put("object","has state& its behaviour");
		hm.put("class","defines state & behaviour share by obj");
		System.out.println(hm);
		
		Set s=hm.entrySet();
		
		System.out.println();
		System.out.println("\nhashmap current size:"+hm.size());
		System.out.println("elements of hashmap");
		System.out.println();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Object ob=itr.next();
			System.out.println(""+ob);
		}
		
		
		
		TreeMap tm=new TreeMap();
		tm.put("xava is","oop");
		tm.put("java is","simple");
		tm.put("zava is","robust");
		tm.put("rama is","temporary");
		System.out.println();
		System.out.println(tm);
		System.out.println("\nelements of treemap iteration");
		System.out.println();
		
		Set s1=tm.entrySet();
		Iterator itr1=s1.iterator();
		
		

	}

}
