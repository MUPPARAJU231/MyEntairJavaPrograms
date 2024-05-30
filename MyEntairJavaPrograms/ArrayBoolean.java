package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBoolean 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		boolean[] b=new boolean[3];
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the boolean value of array->"+i);
			 b[i] = s1.nextBoolean();
		}
		s1.close();
		System.out.println(Arrays.toString(b));
	}
}
