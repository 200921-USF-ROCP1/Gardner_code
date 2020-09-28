package com.revature.app;

import java.util.ArrayList;

import com.revature.generic.arraylist.*;

public class App 
{

	public static void main(String[] args)
	{
		ArrayList<String> arlst = new ArrayList<String>();
		arlst.add("This");
		arlst.add("is");
		arlst.add("Spartaaa");
		
		for(int i = 0; i < arlst.count(); ++i) 
		{
			System.out.println(arlst.get(i));
		}
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(5);
		intList.add(6);
		intList.add(5);
		intList.add(7);
		
		
		Object[][] split = intList.split(3);
		
		for(int i = 0; i < split.length; ++i) 
		{
			for(int j = 0; j < split[i].length; ++j) 
			{
				System.out.print(split[i][j]);
				
				if (j + 1 < split[i].length) 
				{
					System.out.print(",");
				}
			}
			System.out.print("\n");
		}
	}
}
