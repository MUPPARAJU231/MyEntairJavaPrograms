package assignments;

import java.util.Scanner;

public class ArrayAtRunTime 
{
	public static void main(String[] args)
	{

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter The Size of the Array->");
		int size_of_array=s1.nextInt();
		int rollno[]=new int[size_of_array];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the Array->"+i);
			rollno[i]=s1.nextInt();
			System.out.println(rollno);
		}
		s1.close();
	}
}
