package practice.exam;
public class VerticalName
{
	public static void main(String[] args)
	{
		String input="priya";
		for(int i=0;i<input.length();i++)
		{
			char a=input.charAt(i);
			System.out.println(a);
		}
		System.out.println("======");
		for	(int i=input.length()-1;i>=0;i--)
		{
				char b=input.charAt(i);
				System.out.println(b);
		}
		
	}
}
