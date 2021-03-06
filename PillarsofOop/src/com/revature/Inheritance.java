package com.revature;

public class Inheritance {
	private String name;
	private int age;
	
	public Inheritance(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void becomeOlder()
	{
		++age;
	}
	
	public void printSelf()
	{
		System.out.println("I am a parent!");
	}
}
