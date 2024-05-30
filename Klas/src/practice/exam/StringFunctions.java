package practice.exam;

public class StringFunctions 
{
	public static void main(String[] args)
	{
		String name="Sri Veera Venkata Satyanarayana";
		System.out.println(name.length());
		System.out.println(name.charAt(4));
		System.out.println(name.indexOf('V'));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat("SSN"));
		System.out.println(name.contains("sri"));
		System.out.println(name.isEmpty());
		System.out.println(name.substring(17));
		System.out.println(name.substring(10, 17));
		System.out.println(name.trim());
	}
}
