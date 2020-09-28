package com.revature.finalize;

public final class WhatisFinal 
{	
	// final variables cannot be finalized 
	final int b = 5;
	
	// final methods cannot be overridden
	public final void doStuff()
	{
		
	}
	
	public void doFinally()
	{
		try
		{
			
		} 
		catch (Exception e)
		{
			
		} 
		finally 
		{
			// this block always runs
			// even if the method has returned
		}
	}
	
	// run right before the object
	// destroyed by garbage collector
	public void finalize()
	{
		System.out.print("Hello there!");
	}
	
}
