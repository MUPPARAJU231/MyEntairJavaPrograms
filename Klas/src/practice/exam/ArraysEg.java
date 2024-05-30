package practice.exam;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEg
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=s.nextInt();
		s.close();
		int rollno[]=new  int[size];
		rollno[0]=11;
		rollno[1]=12;
		rollno[2]=13;
		System.out.println(Arrays.toString(rollno));
		String name[]=new String[rollno.length];
		name[0]="Delhi";
		name[1]="Rollex";
		name[2]="Das";
		System.out.println(Arrays.toString(name));
		char gender[]=new char[name.length];
		gender[0]='m';
		gender[1]='m';
		gender[2]='m';
		System.out.println(Arrays.toString(gender));
		System.out.println("RollNo"+"Name "+"Gender");
		for(int i=0;i<rollno.length;i++)
		{
			System.out.println(rollno[i]+"     "+name[i]+"   "+gender[i]);
		}

	}
}
