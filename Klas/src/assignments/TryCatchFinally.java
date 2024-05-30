package assignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchFinally
{

	public static void main(String[] args)
	{
	
		Scanner s=new Scanner(System.in);
		s.close();
		try
		{
			int age=s.nextInt();
			System.out.println(age);
		}
		catch(InputMismatchException e)
		{
			System.out.println("Handled the Exception");
		}
		finally
		{
			System.out.println("Hello World");
		}
		
	}
}
