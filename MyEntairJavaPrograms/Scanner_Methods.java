package assignments;

import java.util.Scanner;

public class Scanner_Methods 
{
	static Scanner s=new Scanner(System.in);
	static void add()
	{
		System.out.println("Enter +ve Int Values->");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
	static void sub()
	{
		System.out.println("Enter +ve Byte Values->");
		byte a=s.nextByte();
		byte b=s.nextByte();
		byte sub=(byte) (a-b);
		System.out.println(sub);
	}
	static void mul()
	{
		System.out.println("Enter +ve long Values->");
		long a=s.nextLong();
		long b=s.nextLong();
		int mul=(int) (a*b);
		System.out.println(mul);
	}
	static void div()
	{
		System.out.println("Enter +ve Double Values->");
		double a=s.nextDouble();
		double b=s.nextDouble();
		double div=a/b;
		System.out.println(div);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}
}
