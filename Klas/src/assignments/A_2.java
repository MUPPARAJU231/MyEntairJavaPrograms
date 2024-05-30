package assignments;

public class A_2 {

	static int a=3;
	static int b=50;

	static void add() {
		int sum=a+b;
		System.out.println(sum);
	}

	static void sub() {
		int sub=a-b;
		System.out.println(sub);
	}

	static void mul() {
		int mul=a*b;
		System.out.println(mul);
	}
	static void div() {
		int div=b/a;
		System.out.println(div);
	}
	static void mod() {
		int mod=b%a;
		System.out.println(mod);
	}
	
	public static void main(String[] args) {
		
		add();
		sub();
		mul();
		div();
		mod();
	}

}


