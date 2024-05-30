package assignments;

import java.util.Arrays;

public class Count_Spaces 
{
	 static int count_spaces = 0;
	public static void main(String[] args) 
	{  
		String name="R anjith Kumar Chowdary";
		char[] c1=name.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean b=Character.isSpaceChar(c1[i]);
			if(b==true)
			{
				count_spaces++;
			}
		}
		System.out.println("Total count of Spaces->"+count_spaces);
		
	}
}
