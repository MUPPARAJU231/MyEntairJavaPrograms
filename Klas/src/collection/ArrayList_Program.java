package collection;

import java.util.ArrayList;

public class ArrayList_Program 
{
	public static void main(String[] args) 
	{
	ArrayList a1= new ArrayList();
	a1.add("Ram");
	a1.add("Umaesh");
	a1.add(12);
	a1.add("67");
	a1.add(true);
	a1.add(98);
	System.out.println(a1);
	System.out.println(a1.size());
	System.out.println(a1.contains("Ram"));
	
	ArrayList a2=new ArrayList();
	a2.addAll(a1);
	a2.add(1, "Mahesh");
	a2.addAll(0, a1);
	System.out.println(a2);
	
	}
}
