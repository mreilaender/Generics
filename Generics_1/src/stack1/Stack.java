package stack1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Stack<T>
{
	/* private - Attributes */
	private LinkedList<T> list;
	private T temp;
	public Stack()
	{
		this.list = new LinkedList<T>();
	}
	public void push(T type)
	{
//		System.out.println(""+type.toString());
		this.list.addLast(type);
	}
	public T pop()
	{
		temp = this.list.getLast();
		this.list.removeLast();
		return temp;
		
	}
	public T peek()
	{
		return this.list.getFirst();
	}
	@SuppressWarnings("rawtypes")
	public String list()
	{
		String stringTemp = "";
		Iterator i = this.list.iterator();
		for(int j = 0;i.hasNext();++j)
		{
			//Checking if this is the first stage to format String so there is no "," at the end
			if(j==0)stringTemp += i.next().toString(); else stringTemp += ", " + i.next().toString();
		}
//		return stringTemp.substring(0, stringTemp.length()-2);
		return stringTemp;
	}
	
	/* Getters and Setters */
	public T getTemp() { return temp; }
}