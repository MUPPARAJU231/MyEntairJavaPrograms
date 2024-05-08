package assignments;

import java.util.Arrays;

public class Array_Has41 
{
    static int count_givenno=0;
	public static void main(String[] args)
	{
	
		int nos[]=new int[4];
		nos[0]=41;
		nos[1]=54;
		nos[2]=41;
		nos[3]=41;
		System.out.println(Arrays.toString(nos));
		
		int given_no=41;
		for(int i=0;i<nos.length;i++)
		{
			if(given_no==nos[i])
			{
				System.out.println("No is Present in the "
						+ "given Array At Index->"+i);
				count_givenno++;
			}
			else
			{
				System.out.println("No is not Present in the "
						+ "given Array At Index->"+i);
			}
		}
		System.out.println("count_givenno ="+count_givenno);
	}
}
