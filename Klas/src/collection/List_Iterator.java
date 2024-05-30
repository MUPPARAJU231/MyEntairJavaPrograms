package collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class List_Iterator 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("box");
		a1.add("bottle");
		
		ListIterator li=a1.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("=============");
	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous());
	    }
	}
}
