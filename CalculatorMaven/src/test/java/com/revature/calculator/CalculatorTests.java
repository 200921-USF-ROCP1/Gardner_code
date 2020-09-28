package com.revature.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
	
	@Test
	public void test1()
	{
		//Set up
		calculator calc = new MyCalculator();
		
		//
		int a = 3, b = 2;
		int testAnswer = 5;
		
		int actualAnswer = calc.add(a,  b);
		
		Assertions.assertEquals(testAnswer, actualAnswer);
	}
}
