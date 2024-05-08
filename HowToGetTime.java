package assignments;

import java.util.Date;

public class HowToGetTime 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		System.out.println(d.getTime());
		
		Date d1=new Date(d.getTime());	
		System.out.println(d1);
		
		Date future_time=new Date(d1.getTime()+(5*24*60*60*1000));
		System.out.println(future_time);
		Date past_time=new Date(d1.getTime()-(5*24*60*60*1000));
		System.out.println(past_time);
		
	}

}
