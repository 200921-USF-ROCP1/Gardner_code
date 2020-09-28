package com.revature;

public class ChildOfInheritance extends Inheritance {
	public ChildOfInheritance(String name)
	{
		super(name, 1);
	}
	
	public ChildOfInheritance(String name, int age)
	{
		super(name, age);
	}
	
	public void printSelf()
	{
		System.out.println("I am a child!");
	}
}
