package com.studyJava;
import java.util.StringTokenizer;
public class strtok 
{

	public static void main(String[] args) 
	{
		String longestWord="";
		String s="please do, not touch ,my pet,aligator";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreTokens())
		{
			String w=st.nextToken();
			if(w.length()>longestWord.length())
			{
				longestWord=w;
			}
		}
	System.out.println(longestWord);
	}

}
