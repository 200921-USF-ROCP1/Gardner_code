package com.revature.generic.arraylist;

public class ArrayList<T> 
{
	private T[] arr;
	private int count;
	
	public ArrayList() 
	{
		arr = (T[])new Object[10];
		count = 0;
	}
	
	public void add(T t) 
	{
		if (count < arr.length) 
		{
			arr[count] = t;
			++count;
		} 
		else 
		{
			//Array of size arr.length*2
			T[] newArr = (T[])new Object[arr.length * 2];
			
			//Copy arr into new array
			for (int i = 0; i < arr.length; ++i) 
			{
				newArr[i] = arr[i];
			}
			arr = newArr;
			
			//Add our item
			add(t);
		}
		
		
	}
	
	public T get(int i) 
	{
		return arr[i];
	}
	
	public int size() 
	{
		return arr.length;
	}
	
	public int count()
	{
		return count;
	}
	
	//Take r and split into a number of subarrays
	//Number given by numberofNewArrays
	//Example: if [1,5,6,5,7] and input 3
	//so the output would be:
	// [
	//      [1,5],
	//	    [6,5],
	//		[7, null]
    // ]
	
	
   
	
		public T[][] split(int numberOfNewArrays)
	{ 
		// Make new array of size numberofArrays
		//  -should be array of arrays
		//  -Each subarray contains length/numberofArrays elements
			int newSize;
			
			if(count % numberOfNewArrays == 0) {
				newSize = count / numberOfNewArrays;
			}
			else {
				newSize = (count/numberOfNewArrays) + 1;
			}
		T[][] returnVal = (T[][]) new Object[numberOfNewArrays][newSize];
		
		// Use a for loop to copy elements into new arrays
		int currentIndex = 0;
		for (int i = 0; i < returnVal.length; ++i) 
		{
			for(int j = 0; j < returnVal[i].length; ++j) 
			{
				if (currentIndex >= count) 
				{
					break;
				}
				returnVal[i][j] = arr[currentIndex];
				++currentIndex;
			}
		}
		
		// return the array
		return returnVal;
	}
		
	public String toString() 
	{
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; ++i) 
		{
			sb.append(arr[i]);
			
			if (i + 1 < arr.length) 
			{
				sb.append(", ");
			}
		}
		
		
		return sb.toString();
	}
	
}
