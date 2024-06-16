package assignments;

public class Local_Variable 
{
	static void mul()
	{
		int a=2;
		int b=5;
		int mul=a*b;
		System.out.println(mul);
	}
	void div()
	{
		int a=24;
		int b=6;
		int div=a/b;
		System.out.println(div);
	}
	public static void main(String[] args) {
		mul();
		Local_Variable d= new Local_Variable();
		d.div();
	}

}
