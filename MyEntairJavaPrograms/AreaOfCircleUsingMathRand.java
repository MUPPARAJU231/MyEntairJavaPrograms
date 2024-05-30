package assignments;

public class AreaOfCircleUsingMathRand
{
	public static void main(String[] args) 
	{
		//  Using Math.random() get the radius of 10 circles & find the area of each circle?
		for(int i=0; i<=10;i++)
		{
			double r=Math.random();
			System.out.println("Radius of the circle="+r);
			System.out.println("Area of the Circle="+Math.PI*r*r);
		}
		
	}
}
