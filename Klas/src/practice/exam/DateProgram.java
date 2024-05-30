package practice.exam;

import java.util.Date;

public class DateProgram 
{
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());//epoch time
		System.out.println(d1);
		String input=d1.toString();
		
		String day=input.substring(0, 3);
		System.out.println(day);
		String month=input.substring(4, 7);
		System.out.println(month);
		String date=input.substring(8, 10);
		System.out.println(date);
		String year=input.substring(input.length()-4);
		System.out.println(year);
		
		System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		
		Date d2=new Date(d1.getTime()-(6*24*60*60*1000));
		System.out.println(d2);
		
	}
}
