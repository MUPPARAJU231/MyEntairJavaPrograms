package collection;

public class String_Builder 
{
	public static void main(String[] args) 
	{
		StringBuilder s=new StringBuilder();
		System.out.println(s.capacity());
		s.append("i am new to ");
		System.out.println(s.charAt(0));

		s.append(" tenet");
		System.out.println(s);
		System.out.println(s.codePointAt(2));
        System.out.println(s.repeat(97, 0));  
//		System.out.println(s.reverse());
		System.out.println(s.lastIndexOf("t"));
		System.out.println(s.replace(5, 8, "old"));
		
	}

}
