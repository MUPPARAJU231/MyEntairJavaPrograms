package assignments;

public class EvenOdd 
{
	public static void main(String[] args) 
	{
		/*
		 * System.out.println("Even No's upto 100"); for(int i=2; i<=100; i++) {
		 * System.out.println(i); i++; } System.out.println("Odd No's upto 100");
		 * for(int i=1; i<=100; i++) { System.out.println(i); i++; }
		 */
		System.out.println("Even No's upto 10");
		for(int i=0; i<=10; i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("Odd No's upto 10");
		for(int i=0; i<=10; i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
			}
		}
	}
}
