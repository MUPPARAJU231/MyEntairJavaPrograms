package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class List_Set_Program
{
	public static void main(String[] args) 
	{
		System.out.println("Lets understand everything about List");
		List a1=new ArrayList();
		a1.add("Pen");
		a1.add("Pencil");
		a1.add("box");
		a1.add("bottle");
		System.out.println(a1);//List follows indexing
		//Order of Insertion -True
		a1.add("Pen");//List allows duplicates
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(null);//List allow multiple null values
		System.out.println(a1);
		Iterator i2=a1.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}


		System.out.println("Lets understand everything about Set");
		Set a2=new HashSet();
		a2.add("Pen");
		a2.add("Pencil");
		a2.add("box");
		a2.add("bottle");
		System.out.println(a2);//Set Does not follow indexing,It follow Hashcode value
		//Order of Insertion -False
		a2.add("Pen");//Set does not allow duplicates
		a2.add(null);
		a2.add(null);
		a2.add(null);
		a2.add(null);//set allows only one null value
		System.out.println(a2);
		Iterator i3=a2.iterator();
		while(i3.hasNext())
		{
			System.out.println(i3.next());
		}

	}
}
