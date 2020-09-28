package com.revature.calculator.genreic;

import CalculatorActivity.calculator;

public class CalculatorImpl<T extends Number> implements Calculator<T>{

	@Override
	public double add(T a, T b) {
		// TODO Auto-generated method stub
		return a.doubleValue() +  b.doubleValue();
	}

	@Override
	public double subtract(T a, T b) {
		// TODO Auto-generated method stub
		return a.doubleValue() -  b.doubleValue();
	}

	@Override
	public double multiply(T a, T b) {
		// TODO Auto-generated method stub
		return a.doubleValue() * b.doubleValue();
	}

	@Override
	public double divide(T a, T b) {
		// TODO Auto-generated method stub
		return a.doubleValue() /  b.doubleValue();
	}

	@Override
	public double exponent(T x, T e) {
		// TODO Auto-generated method stub
		double num = 1;
		for (int i = 0; i < e.intValue(); ++i) {
			num *= x.doubleValue();
		}

		return num;
	}

	
/*	public int fibonacci(int i) {
		// TODO Auto-generated method stub
		if (i < 2) {
			return i;
		} else {
			return fibonacci(i - 1) + fibonacci(i - 2);
		}

	}
*/
	@Override
	public int parse(String s) {
		// ["5", "+", "2"] format

		String[] parts = s.split(" ");
		if (Character.isDigit(parts[0].charAt(0))) {
			int firstNum = Integer.parseInt(parts[0]), secondNum = Integer.parseInt(parts[2]);

			switch (parts[1]) {
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
		} /*else {
			switch (parts[0]) {
			case "fib":
				return fibonacci(Integer.parseInt(parts[1]));
			case "exp":
				return exponent(Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
			default:
				return 0;
			}

		}
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		System.out.println(add(a, b));
		System.out.println(subtract(a, b));
		System.out.println(multiply(a, b));
		System.out.println(divide(a, b));
		System.out.println(exponent(a, b));
		System.out.println(fibonacci);
	}

} */
