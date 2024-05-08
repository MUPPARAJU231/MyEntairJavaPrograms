package assignments;

public class Palindrome 
{

	public static void main(String[] args)
	{
	
		String input ="TENET";
		String reverse="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			char op=input.charAt(i);
			reverse=reverse+op;
		}
		System.out.println(reverse);
		if(input.equals(reverse))
		{
			System.out.println("It is a Palindrome");
		}
		else
		{
			System.out.println("It is Not a Pali drome");
		}
		
	}
}
