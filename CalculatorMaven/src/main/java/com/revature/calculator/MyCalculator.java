package com.revature.calculator;

public class MyCalculator implements calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

	@Override
	public int exponent(int x, int e) {
		// TODO Auto-generated method stub
		int num = 1;
		for(int i = 0; i < e; ++i)
		{
			num *= x; 
		}
		
		return num;
	}
		
	public int exponentRecursive(int x, int e) {
		if (e == 0)
			return 1;
		
		return x*exponentRecursive(x, e - 1);
	}
	
	@Override
	public int fibonacci(int i) {
		// TODO Auto-generated method stub
		if (i < 2)
		{
			return i;
		}
		else 
		{
			return fibonacci(i-1) + fibonacci(i-2);
		}
		
	}

	@Override
	public int parse(String s) {
		// ["5", "+", "2"] format
		
		String[] parts = s.split(" ");
		
		if (Character.isDigit(parts[0].charAt(0))) {
		int firstNum = Integer.parseInt(parts[0]),
				secondNum = Integer.parseInt(parts[2]);
		
		switch(parts[1])
		{
			case "+":
				return add(firstNum, secondNum);
			case "-":
				return subtract(firstNum, secondNum);
			case "*":
				return multiply(firstNum, secondNum);
			case "/":
				return divide(firstNum, secondNum);
			default:
				return 0;
		}
		} else {
			switch(parts[0]) {
			case "fib":
				return fibonacci(Integer.parseInt(parts[1]));
			case "exp":
				return exponent(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
			default:
				return 0;
			}
		}
		
	}
	
	
}
