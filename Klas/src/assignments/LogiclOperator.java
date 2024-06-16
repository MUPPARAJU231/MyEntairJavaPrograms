package assignments;

public class LogiclOperator 
{
	public static void main(String[] args)
	{
		int a=10,b=20;
		if(a>1 && b<30 )
		{
			System.out.println("And Operator");
		}
		if(a>10 || b<=20)
		{
			System.out.println("OR operator");
		}
		
		if(!(a>1 || b<30 ))
		{
			System.out.println("Not OR operator");
		}
		if(!(a>10 && b<=20))
		{
			System.out.println(" Not And operator");
		}
	}
}
