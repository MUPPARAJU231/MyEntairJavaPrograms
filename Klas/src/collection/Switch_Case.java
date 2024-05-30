package collection;

import java.util.Scanner;

public class Switch_Case 
{
 	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int no=s.nextInt();

		switch(no)
		{
		case(1):
			System.out.println("Launch Google Chrome");
		break;
		case(2):
			System.out.println("Launch Mozilla");
		break;
		case(3):
			System.out.println("Launch Edge");
		break;
		default:
			System.out.println("Sorry it is a Wrong Selection");
		}
	}
}
