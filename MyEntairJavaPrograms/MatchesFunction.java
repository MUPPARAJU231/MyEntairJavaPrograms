package assignments;

public class MatchesFunction
{
	public static void main(String[] args) 
	{
		String input = "Manish";
		System.out.println(input.matches("M(.*)"));
		//Check the name ends with h
		System.out.println(input.matches("(.*)h"));
		//Check if the String contains 5 letters.
		String ip="malika";
		System.out.println(ip.matches("....."));
		//Check the Last Index of the String "School"
		String a="School";
		int a1=a.lastIndexOf('o');
		System.out.println(a1);
		
	}
}
