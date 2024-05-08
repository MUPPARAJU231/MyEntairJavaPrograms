package assignments;

public class EmptyString
{
	public static void main(String[] args) 
	{
		String name="";
		System.out.println(name.isEmpty());
		
		String name2="Ranjith Kumar Chowdary";
		
		System.out.println(name2.substring(1));
		System.out.println(name2.substring(8,13));
		System.out.println(name2.substring(0,8));
		System.out.println(name2.substring(0,2));
		System.out.println(name2.substring(name2.length()-8));
	}
}
