package assignments;

import java.util.Scanner;

public class If_Condition 
{
	static String male,female,custom;
	public static void main(String[] args) 
	{
		//The fare value of Bus From Place A to B Based on Gender

		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the Gender of the Passenger.");
		String gender=s1.next();
		gender.toLowerCase();
		s1.close();

		if(gender==male) 
		{
			System.out.println("Fare is 50rs.");
		}
		else if(gender==female)
		{
			System.out.println("Fare is 35rs");
		}
		else
		{
			System.out.println("Fare is 30rs");
		}
	}
}
