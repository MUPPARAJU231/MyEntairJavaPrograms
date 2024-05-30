package assignments;

import java.util.Arrays;

public class Count_Alpha 
{
	 static int count_alpha = 0;
	public static void main(String[] args) 
	{  
		String name="manish";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean answer=Character.isAlphabetic(c1[i]);
			if(answer==true)
			{
				count_alpha++;
			}
		}
		System.out.println("Total count of Alphabets->"+count_alpha);
		
	}
}
