package assignments;

public class String_Functions
{
	public static void main(String[] args)
	{
		String name="School";
		
		System.out.println(name.length());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf("l"));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.concat(" name is ABC Public School"));
		
		String first_name="Manish";
		String second_name="Tiwari";
		
		System.out.println(first_name.concat(" ").concat(second_name));
		System.out.println(name.contains("sch"));
		
		String title_of_page="      we are here for your online needs   ";
		System.out.println(title_of_page.trim());
		
	}

}
