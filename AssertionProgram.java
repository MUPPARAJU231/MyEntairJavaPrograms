package assignments;

import java.util.Arrays;

public class AssertionProgram 
{

	static void add(int a,int b)
	{
		assert a==100;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public static void main(String[] args) 
	{
	    add(100, 200);
		String name="V";
		assert name.length()>0;
		System.out.println(name.concat(" Mupparaju"));
		//assertion with Array and for loop
		int no[]=new int[3];
		no[0]=1;
		no[1]=7;
		no[2]=9;
		for(int i=0;i<no.length;i++)
		{
			assert no[i] !=0;
		}
		System.out.println(Arrays.toString(no));
		
	}
}
