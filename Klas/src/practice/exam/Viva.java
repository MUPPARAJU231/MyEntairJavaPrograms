package practice.exam;
abstract class Muppa
{
	abstract void sub();
}
public class Viva extends Muppa
{
	public void add()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Viva v= new Viva();
		v.add();
		v.sub();
	}
	@Override
	void sub()
	{
		int a=20;
		int b=10;
		int subtaction=a-b;
		System.out.println(subtaction);
	}
}
