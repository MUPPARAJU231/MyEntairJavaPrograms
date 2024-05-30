package assignments;

public class Widening 
{
	public static void main(String[] args) 
	{
		byte age=82;
		long age_person=age;
		age_person=1000;
		System.out.println(age_person);
		
		//Narrowing
		byte age_person1=(byte) age_person;
		System.out.println(age_person1);
		System.out.println(Byte.MAX_VALUE);
		
//		convert int datatype into float datatype 
		int i=31;
		float i1=i;//implicitly
		float i2=(float) i;//explicitly
		System.out.println(i1);
		System.out.println(i2);
	}
}
