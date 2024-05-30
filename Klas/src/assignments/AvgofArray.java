package assignments;

public class AvgofArray 
{
	static double sum=0;
	static double avg=0;
	public static void main(String[] args)
	{
		double no[]=new double[4];
		no[0]=14;
		no[1]=31;
		no[2]=54;
		no[3]=19;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
			avg=sum/no.length;
		}
		System.out.println(avg);
	}
}
