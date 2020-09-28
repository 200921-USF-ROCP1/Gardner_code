package com.revature.generic.list;

public class LinkedList<T> 
{
	private Node head;
	private int size;
	
	public LinkedList()
	{
		size = 0;
		head = null;
	}

	// insert
	// Find the last element
	// Create new node and set as next
	// Increase size
	public void insert(T data) 
	{
		Node node = head;
		
		if ( head == null) 
		{
			head = new Node(data, null);
		}
		else 
		{
			while (node.next != null) 
			{
				node = node.next;
			}
		}
		
		Node newNode = new Node(data, null);
		node.next = newNode;

		++size;
	}
	
	
	// get
	//if index >= size, return null
	//Iterate index times to find the data
	//Return the data
	
	public T get (int index) 
	{
		if (index >= size || index < 0) 
		{
			throw new IndexOutOfBoundsException();
		}
		
		Node itr = head;
		
		for(int i = 0; i < index; ++i) 
		{
			itr = itr.next;
		}
		return itr.data;
	}
	
	public int getSize()
	{
		return size;
	}
	
	
	public Iterator getIterator() {
		return new Iterator();
	}
	
	class Node 
	{
		private T data;
		private Node next;

		Node(T data, Node next) 
		{
			this.data = data;
			this.next = next;
		}
	}
	
	public class Iterator
	{
		Node current;
		
		public Iterator() 
		{
			current = head;
		}
		public boolean hasNext() 
		{
			return current != null;
		}
		public void next() 
		{
			current = current.next;
		}
		
		public T getData() {
			return current.data;
		}
	}
}
