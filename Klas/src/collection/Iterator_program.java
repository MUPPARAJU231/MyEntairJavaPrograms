package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_program
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add("Virat");
		a1.add("Rohit");
		a1.add(7);
		a1.add("31");
		a1.add(false);
		a1.add("F1");
		System.out.println(a1);
		
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}
}
