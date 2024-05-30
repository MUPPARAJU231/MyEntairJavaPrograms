package assignments;

public class Remove_All_Alpha
{
	public static void main(String[] args) 
	{
		String input="School123";
		String output=input.replaceAll("[a-z]", "");
		System.out.println(output);
		String output1=input.replaceAll("[A-Z]", "");
		System.out.println(output1);
		String output2=input.replaceAll("[0-9]", "");
		System.out.println(output2);
	}

}
