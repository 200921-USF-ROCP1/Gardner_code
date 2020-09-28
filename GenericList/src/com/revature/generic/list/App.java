package com.revature.generic.list;

import com.revature.generic.list.LinkedList;
import com.revature.generic.list.LinkedList.Iterator;


public class App {
	public static void main(String[] args) 
	{
		LinkedList<String> lst = new LinkedList<String>();
		lst.insert("Hello");
		lst.insert("there");
		lst.insert("friend!");
		
		for (int i = 0; i < lst.getSize(); ++i)
		{
			System.out.println(lst.get(i));
		}
		
		Iterator itr = lst.getIterator();
		while(itr.hasNext()) {
			System.out.print(itr.getData());
			itr.next();
		}
	} 
}
