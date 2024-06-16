package assignments;
public  class Abstact_C_CA_C extends One
{
	void add()
	{
		System.out.println("abstract class CM1");
	}
	void sub()
	{
		System.out.println("abstract class CM2");
	}
	public static void main(String[] args)
	{
		Abstact_C_CA_C o=new Abstact_C_CA_C();

		o.add(); o.sub(); o.mul(); o.div(); o.sqt(); o.mod();

		o.un();
		o.psw();
		System.out.println(o);
	}
	@Override
	void un() {
		// TODO Auto-generated method stub

	}
	@Override
	void psw() {
		// TODO Auto-generated method stub

	}
}
abstract class One extends Two
{
	abstract void un();
	abstract void psw();

	void mul()
	{
		System.out.println("CM1 of class one");
	}
	void div()
	{
		System.out.println("CM2 of class one");
	}
}
class Two
{
	void sqt()
	{
		System.out.println("CM1 of class Two");
	}
	void mod()
	{
		System.out.println("CM2 of class Two");
	}
}