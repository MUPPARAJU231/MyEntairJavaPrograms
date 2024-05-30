package assignments;

public class Polymorphism 
{
	public static void main(String[] args) 
	{
		Parent1 p=new Parent1();
		p.add();
	}
}
class Parent1
{
	void add()
	{
		System.out.println("Parent Class Method");
	}
}
