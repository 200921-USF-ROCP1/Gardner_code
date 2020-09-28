package com.revature.exceptions;

public class Driver
{
	public static void main(String[] args) 
	{
		Exceptions ex = new Exceptions();
		try 
		{
			ex.throwanException(11);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
