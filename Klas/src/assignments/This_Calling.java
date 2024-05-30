package assignments;

public class This_Calling 
{
	This_Calling()
	{
		this("veer");
		System.out.println("1");
	}
	This_Calling(int a)
	{
		System.out.println("2");
	}
	This_Calling(String s)
	{
		this(1);
		System.out.println("3");
	}
	public static void main(String[] args) 
	{
		new This_Calling();
		System.out.println("Concrete Class");
	}

}
