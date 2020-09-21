package com.revature.maleyk;

import java.io.FileReader;
public class Maleyk {
	
	// Primitive / Value types
	boolean bool; // 1 bit(true/false)
	byte b; // 8 bits, 2^3
	char c; // 16 bits
	short s; // 16 bits, 2^4
	int i; // 32 bits, 2^5
	float f; // 32 bits
	long l; // 64 bits, 2^6
	double d; // 64 bits
	
	// Reference types contain a reference or ADDRESS
	// of something in the heap
	String str = new String("Hi I'm new");
	Object o = new Object();
	
	// Access Modifiers:
	// public
	// default
	// protected
	// private
	
	public void myMethod() {
		// Instance method
		str.charAt(0); // 'H'
		//Static method
		String.valueOf(5); // "5"
	}
	
	void myDefaultMethod() {}
	
	// Protected - accessed from inside the class (and subclasses)
	protected void myProtectedMethod() {}
	
	private void myPrivateMethod() {}
	
	private class PrivateClass {}
	
	static class StaticClass {}
	
	// Constructors
	public Maleyk() {
		System.out.println("Inside Jacob constructor.");
	}
	
	public Maleyk(int i, char c, boolean bool) {
		this.i = i;
		this.c = c;
		this.bool = bool;
		}
	// Java prefers certain scopes:
	//	Class
	//	Method
	
	public void scopes (int i) {
		// Use "this" to get to class variables in that case
		this.i = i;
	}
	
	// Control Statements
	public void control(boolean yes, int val) {
		if (yes) {
			// Do something if true
		} else if (val == 2) {
			// Do something if true
		} else {
			
		}
		
		for (int i = 0; i < val; ++i) {
			// break immediately exits the loop
			break;
		}
		
		for (; yes;) {
			if (val == 1)
				continue;
		}
		
		for (; (val++) < 5;) {}
		
		while (yes) {
			// Do something repeatedly while true
		}
		
		do {
			// Run once, then again for as long as true
		} while (yes);
		
		switch (val) {
		case 0:
			// Do something
			break;
		case 1:
			// Do something
			break;
		default:
			// If nothing else matches, do this
			break;
		}
	}
}

