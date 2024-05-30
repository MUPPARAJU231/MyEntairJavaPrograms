package assignments;

public class Avgof2Arrays 
{
	static double sum=0;
	static double sum1=0;
	static double avg=0;
	public static void main(String[] args)
	{
		int nos[]=new int[4];
		nos[0]=5;
		nos[1]=9;
		nos[2]=4;
		nos[3]=7;
		
		double no[]=new double[4];
		no[0]=14;
		no[1]=31;
		no[2]=54;
		no[3]=19;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
			sum1=sum1+nos[i];
			avg=sum+sum1/(no.length+nos.length);
		}
		System.out.println(avg);
	}
}
