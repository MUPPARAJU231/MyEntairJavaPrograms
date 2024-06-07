package assignments;
class Parent2
{
	static void add()
	{
		System.out.println("Parent class method");
	}
}
public class SLI extends Parent2
{
	static void sub()
	{
		System.out.println("Child Class method");
	}
	public static void main(String[] args) 
	{
      sub();
      add();

	}
}
