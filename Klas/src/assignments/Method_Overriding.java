package assignments;
class P_One
{
	void add()
	{
		System.out.println("parent class");
	}
	static void sub()
	{
		System.out.println("Parent class Static Method");
	}
}
public class Method_Overriding extends P_One
{
	void add()
	{
		System.out.println("Child class");
		super.add();
	}
	static void sub()
	{
		System.out.println("Child class Static Method");
//		super.sub();
	}
	public static void main(String[] args) 
	{
		sub();
		Method_Overriding m=new Method_Overriding();
		m.add();
		P_One.sub();
	}
}
