package assignments;

import java.util.Scanner;

public class AirthmaticOperation
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter int value ->");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		s1.close();
		int sum=a+b+c;
		System.out.println(sum);
		int div=a%c;
		System.out.println(div);
		double mean=sum/3;
		double mean_reminder=sum%3;
		System.out.println(mean);
		System.out.println(mean_reminder);
	}
}
