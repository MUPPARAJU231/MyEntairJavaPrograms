package practice.exam;

import java.util.Arrays;

public class Count_SpecialChar 
{

	static int count_alpha;
	static int count_digit;
	static int count_space;
	static int count_specialchar;
	public static void main(String[] args) 
	{
		String name="Mupparaju@^$& 123";
		char a[]=name.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			boolean b=Character.isAlphabetic(a[i]);
			boolean b1=Character.isDigit(a[i]);
			boolean b2=Character.isSpaceChar(a[i]);
			if(b==true)
			{
				count_alpha++;
			}
			if(b1==true)
			{
				count_digit++;
			}
			if(b2==true)
			{
				count_space++;
			}
		}
		System.out.println(count_alpha);
		System.out.println(count_digit);
		System.out.println(count_space);
		count_specialchar=(name.length()-(count_alpha+count_digit+count_space));
		System.out.println(count_specialchar);
		
	}
}
