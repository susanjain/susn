package com.studyJava;

import java.util.Scanner;

class UserMainCode4
{
public static String removeEvenElements(String s1)
{
StringBuffer sb1=new StringBuffer();
for(int i=0;i<s1.length();i++)
{
char vow=s1.charAt(i);
if((i%2)==0)
sb1.append(s1.charAt(i));
else if((i%2)!=0)
if(vow!='a' && vow!='e' && vow!='i'&& vow!='o' && vow!='u')
if(vow!='A' && vow!='E' && vow!='I' && vow!='O' && vow!='U')
sb1.append(s1.charAt(i));
}
return sb1.toString();

}
}


public class Lab13
{
public static void main(String[] args)
{
Scanner scn = new Scanner(System.in);
System.out.println("Enter the String");
String s1 = scn.next();
System.out.print("Output String: ");
System.out.println(UserMainCode4.removeEvenElements(s1));
}
}
