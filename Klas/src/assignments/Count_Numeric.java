package assignments;

import java.util.Arrays;

public class Count_Numeric 
{
	 static int count_num = 0;
	public static void main(String[] args) 
	{  
		String name="manish1234";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean b=Character.isDigit(c1[i]);
			if(b==true)
			{
				count_num++;
			}
		}
		System.out.println("Total count of Numbers->"+count_num);
		
	}
}
