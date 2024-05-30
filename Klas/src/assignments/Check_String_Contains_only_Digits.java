package assignments;

import java.util.Arrays;

public class Check_String_Contains_only_Digits 
{
	static int count_digit=0;
	public static void main(String[] args) 
	{
		String s="1234";
		char[] c=s.toCharArray();
		System.out.println(Arrays.toString(c));

		for(int i=0;i<c.length;i++)
		{
			boolean b=Character.isDigit(c[i]);
			if(b==true)
			{
				count_digit++;
			}
		}
		System.out.println(count_digit);
		//How to check the String contains only Digits
		if(s.length()==count_digit)
		{
			System.out.println("String contains Only Digits");
		}
		else
		{
			System.out.println("String is combination of Digits "
					+ "and other Types ");
		}

	}
}
