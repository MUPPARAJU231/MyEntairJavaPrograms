package assignments;

import java.util.Arrays;

public class Count_SpecialChar 
{
	 static int count_specialchar = 0; 
	 static int count_alpha = 0;
	 static int count_num = 0;
	static int count_spaces = 0;
	public static void main(String[] args) 
	{  
		String name="Kumar 123 !@#$";
		char[] c1=name.toCharArray();
		int ls =c1.length;
		System.out.println(ls);
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<c1.length;i++)
		{
			boolean a=Character.isAlphabetic(c1[i]);
			boolean b=Character.isDigit(c1[i]);
			boolean c=Character.isSpaceChar(c1[i]);
			if(a==true)
			{
				count_alpha++;
			}
			if(b==true)
			{
				count_num++;
			}
			if(c==true)
			{
				count_spaces++;
			}
		}
		System.out.println("Total count of Alphbets->"+count_alpha);
		System.out.println("Total count of Numbers->"+count_num);
		System.out.println("Total count of Spaces->"+count_spaces);
		count_specialchar=ls-(count_alpha+count_num+count_spaces);
		System.out.println("Total No'of SpecialChar->"+count_specialchar);
	}
}
