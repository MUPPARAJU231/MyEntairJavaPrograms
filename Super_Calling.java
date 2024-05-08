package assignments;

public class Super_Calling extends Child
{
	Super_Calling()
	{
		super(3);
		System.out.println("Childest Class");
	}
	public static void main(String[] args) 
	{
		new Super_Calling();
	}
}
class Parent  
{
	Parent()
	{
		System.out.println("Parent Class");
	}
}
class Child extends Parent
{
	Child(int a)
	{
		System.out.println("Child Class");
	}

}
