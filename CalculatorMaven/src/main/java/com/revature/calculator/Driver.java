package com.revature.calculator;

import java.util.Scanner;

public class Driver 
{
	public static void main(String[] args)
	{
		
		
		
		System.out.println("Welcome to your calculator!");
		System.out.println("Enter your command below: ");
		
		//Driver d = new Driver();
		//if (d.getClass() == Driver.class) 
		//{
		//	System.out.println("Same class 1");
		//}
		//if (d instanceof Driver)
		//{
		//	System.out.println("Same class 2");
		//}
		//if (o.getClass() == Driver.class) {
		//	System.out.println("Same class 3");
		//}
		
		
		while (true)
		{
			calculate();
		}
	}
	
	public static void calculate() 
	{
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
		
		MyCalculator mc = new MyCalculator();
		System.out.print(line + "=" + mc.parse(line));
	}

	
}
