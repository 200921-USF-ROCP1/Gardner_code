package com.revature.app;

import com.revature.finalize.WhatisFinal;

public class App 
{
	public static void main(String[] args)
	{
		String a = "Hello", b = "there", c =  "friend";
		
		String[] arr = {a, b, c};
		printArgs(arr);
		
		printVarArgs(a, b, c);
		printVarArgs();
		
		System.out.printf("%d %d %d", 1, 2, 3);
		
		WhatisFinal f = new WhatisFinal();
	}
	
	public static void printArgs(String[] strings)
	{
		for (int i = 0; i < strings.length; ++i)
			System.out.print(strings[i]);
	}
	
	public static void printVarArgs(String... strings)
	{
		for (int i = 0; i < strings.length; ++i)
			System.out.print(strings[i]);
	}
	
	public static void aNameAndSomeStrings(String name, String... strings)
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
