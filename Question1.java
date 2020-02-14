/*Write class that declares the following String.
		“The quick brown fox jumps over the lazy dog”.
Perform the following modifications to the above string using appropriate methods.

1.	Print the character at the 12th index.
2.	Check whether the String contains the word “is”.
3.	Add the string “and killed it” to the existing string.
4.	Check whether the String ends with the word “dogs”.
5.	Check whether the String is equal to “The quick brown Fox jumps over the lazy Dog”.
6.	Check whether the String is equal to “THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG”.
7.	Find the index position of the character “a”.
8.	Find the last index position of the character “e”.
9.	Find the length of the String.
10.	Check whether the String matches to “The quick brown Fox jumps over the lazy Dog”.
11.	Replace the word “The” with the word “A”.
12.	Split the above string into two such that two animal names do not come together.
13.	Print the animal names alone separately from the above string.
14.	Print the above string in completely lower case.
15.	Print the above string in completely upper case.*/

package com.studyJava;

public class Question1 
{

	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog ";
		System.out.println("Character at the 12th index is: "+(s.charAt(12)));
		System.out.println("Whether string contains is or not: "+(s.contains("is")));
		String s1 = s.concat("and killed it");
		System.out.println("Add string “and killed it” to the existing string, the resultant string is: "+s1);
		System.out.println("Check whether the String ends with the word dogs: "+(s.endsWith("dogs")));
		System.out.println("Check whether the String is equal to The quick brown Fox jumps over the lazy Dog. " +(s.equals("The quick brown Fox jumps over the lazy Dog")));
		System.out.println("Check whether the String is equal to The quick brown Fox jumps over the lazy Dog. " +(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG")));
		
		
		
	}

}
//When do we go for arraylist and linkedlist?
//How data is getting sorted and stored at treeset?
//What is difference between enumerator and iterator?
//Why enumeration interface became legacy?