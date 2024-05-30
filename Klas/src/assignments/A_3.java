package assignments;

public class A_3 {

	 int a=4;
	 int b=58;

	 void add() {
		int sum=a+b;
		System.out.println(sum);
	}

	 void sub() {
		int sub=a-b;
		System.out.println(sub);
	}

	 void mul() {
		int mul=a*b;
		System.out.println(mul);
	}
	 void div() {
		int div=b/a;
		System.out.println(div);
	}
	 void mod() {
		int mod=b%a;
		System.out.println(mod);
	}
	
	public static void main(String[] args) {
		A_3 m=new A_3();
				
		m.add();
		m.sub();
		m.mul();
		m.div();
		m.mod();
	}

}


