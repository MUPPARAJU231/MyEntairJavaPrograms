package assignments;


public abstract class Abstact_C_AC_C extends One
{
	abstract void un();
	abstract void psw();
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
	Two o=new Two();
	/*
	 * o.add(); o.sub(); o.mul(); o.div(); o.sqt(); o.mod();
	 */
//	o.un();
//	o.psw();
	System.out.println(o);
	}
}

class One
{
	void mul()
	{
		System.out.println("CM1 of class one");
	}
	void div()
	{
		System.out.println("CM2 of class one");
	}
}

class Two extends Abstact_C_AC_C
{
	void sqt()
	{
		System.out.println("CM1 of class Two");
	}
	void mod()
	{
		System.out.println("CM2 of class Two");
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