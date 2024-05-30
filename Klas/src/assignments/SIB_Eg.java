package assignments;

public class SIB_Eg
{
	public static void main(String[] args) 
	{
		System.out.println("MainMethod");
		SIB_Eg s=new SIB_Eg();
		SIB_Eg s1=new SIB_Eg();
		System.out.println("mm");
	}
	SIB_Eg()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	static
	{
		System.out.println("SIB 1");
	}
	{
		System.out.println("IIB 1");
	}
}
