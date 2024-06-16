package assignments;

public class ThisKeyword 
{
	int age;
	String name;
	double salary;
	void employee_details(int age, String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
		System.out.println(age+name+salary);
	}
	public static void main(String[] args)
	{
		ThisKeyword a=new ThisKeyword(); 	
		a.employee_details(31, "Veer", 99.99);
		System.out.println(a.age);
		System.out.println(a.name);
		System.out.println(a.salary);
	}
}
