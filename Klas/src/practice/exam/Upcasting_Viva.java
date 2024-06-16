package practice.exam;
class Parent_one
{
	 void add()
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}
public class Upcasting_Viva extends Parent_one
{
	static void mul()
	{
		int x=5;
		int y=9;
		int mult=x*y;
		System.out.println(mult);
	}
	public static void main(String[] args)
	{
		Parent_one p=new Upcasting_Viva();
		p.add();
		mul();
	}
}
