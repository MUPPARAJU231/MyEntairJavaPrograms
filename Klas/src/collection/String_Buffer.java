package collection;

public class String_Buffer
{
	public static void main(String[] args) 
	{
		StringBuffer s=new StringBuffer();
		System.out.println(s.capacity());
		s.append("a quick brown fox jumps over");
		System.out.println(s.charAt(0));

		s.append(" tenet");
		System.out.println(s);
		System.out.println(s.codePointAt(2));
        System.out.println(s.repeat(97, 0));  
		System.out.println(s.reverse());

		
	}
}
