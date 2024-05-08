package assignments;

import java.util.Scanner;

public class Try_Catch 
{
	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter the Size of the Array->");
		int n1= s1.nextInt();
		s1.close();
		String name[]= new String[n1];
		name[0]="Ram";
		name[1]="Sita";
		name[2]="Laxman";
		try
		{
			name[3]="Hanuman";
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled");
		}
		//	if the user enter entered n1= 3,
		//	if the user enter entered n1= manish,
	}
}
