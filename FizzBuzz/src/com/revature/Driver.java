package com.revature;

public class Driver {
	public static void main(String[] args) {
		int testValue = 16;
		
		FizzBuzz(testValue);
	}
	
	public static void FizzBuzz(int a) {
		for (int i = 1; i <= a; i++)
		{
			if (i % 3 == 0 && i % 5 == 0)
			{
				System.out.print("FizzBuzz" + " ");
				
			}
			else if (i % 3 == 0)
			{
				System.out.print("Fizz" + " ");
			}
			else if (i % 5 == 0)
			{
				System.out.print("Buzz" + " ");
			}
			else
			{
				System.out.print(i + " ");
			}
		}
	}
}
