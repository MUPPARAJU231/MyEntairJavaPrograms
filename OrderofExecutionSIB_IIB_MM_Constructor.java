package assignments;

public class OrderofExecutionSIB_IIB_MM_Constructor 
{

	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	OrderofExecutionSIB_IIB_MM_Constructor()
	{
		System.out.println("Constructor");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		OrderofExecutionSIB_IIB_MM_Constructor a
		=new OrderofExecutionSIB_IIB_MM_Constructor();
	}
}
