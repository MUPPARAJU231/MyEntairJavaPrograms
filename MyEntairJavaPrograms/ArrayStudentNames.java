package assignments;

public class ArrayStudentNames
{
	public static void main(String[] args)
	{
		String names[]=new String[3];
		names[0]="Jyothi";
		names[1]="Kajol";
		names[2]="Muppa";

		int []rollno=new int[3];
		rollno[0]=77;
		rollno[1]=31;
		rollno[2]=54;
		
		char gender[]=new char[3];
		gender[0]='F';
		gender[1]='F';
		gender[2]='M';
		
		System.out.println("RollNo"+"  "+"StudentNames"+" "+"Gender");
		for(int i=0;i<names.length;i++)
		{
			System.out.println(rollno[i]+"       "+names[i]+"        "+gender[i]);
		}
		

	}
}
