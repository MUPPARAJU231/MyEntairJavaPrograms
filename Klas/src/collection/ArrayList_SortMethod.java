package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_SortMethod
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(15);
		a1.add(76);
		a1.add(900);
		a1.add(-120);
		a1.add(65);
		a1.add(23);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println(a1.get(2));
		a1.set(2, "ram");
		System.out.println(a1);
		System.out.println(a1.indexOf(76));

	}
}
