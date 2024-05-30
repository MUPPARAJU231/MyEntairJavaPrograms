package assignments;

public class A_5 {
	A_5() 
	{
		System.out.println("Default Constructor");
	}
	public A_5(int a) 
	{
		System.out.println("Parameterized Constructor");
	}
	public A_5(int i,long l,float f,double d,boolean bl,char c,String st) 
	{
		System.out.println("Parameterized Constructor with multiple parameters");
	}
	public static void main(String[] args) 
	{
		new A_5();
		new A_5(6);
		new A_5(3,4l,0.5f,6.56,true,'q',"veer");
	}
}
