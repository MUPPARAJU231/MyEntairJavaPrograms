package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrintInEasyWay 
{
	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);	

		int rollno[]=new int[3];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter The Array->"+i);
			rollno[i]=s1.nextInt();
		}

		int rollno1[]=new int[3];
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println("Enter The Array->"+i);
			rollno1[i]=s1.nextInt();
		}
		s1.close();
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno1));
		if(Arrays.equals(rollno, rollno1)==true)
		{
			System.out.println("Hey you did Magic 2 Arrays are Exactly Same");		    	
		}
		else
		{
			System.out.println("Sorry 2 Arrays Different");
		}

	}
}
