package assignments;

public class Narrowing 
{

	public static void main(String[] args) 
	{
	
		long age=3100;
		byte new_age=(byte) age;
		System.out.println(new_age);
		System.out.println(Byte.MAX_VALUE);
		
	}
}
