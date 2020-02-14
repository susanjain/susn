package com.studyJava;
import java.io.*;

public class FileTest1 
{

	public static void main(String[] args) throws Exception
	{
		/*Byte stream
		  
	
		String s="pw2.java";
		String s1="pw1.java";
		int i;
		FileInputStream fis= new FileInputStream(s1);
		FileOutputStream bw= new FileOutputStream(s,false);
		fis.skip(4);
		while((i=fis.read())!=-1)
		{
			bw.flush();
			bw.write(i);
		}
		bw.close();
		fis.close();
		
		
		*/
		
	
	try
	{
		File f= new File("pw2.java");
		FileReader fin=new FileReader(new File("pwd1.java"));
		FileWriter fout= new FileWriter(f);
		int i=0;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
			
		}
		fout.close();
	}
	catch(Exception e)
	{
		
	}
	
	
	
	
	}

}
