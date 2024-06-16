package test_parameter;

import org.testng.annotations.Test;

public class MoreParameters_InOneTest
{
	  @Test(invocationCount = 3,priority = -1)
	    void add()
	    {
	   	 System.out.println("1");
	    }
	  @Test(invocationCount = 2,priority = -2)
	    void sun()
	    {
	   	 System.out.println("2");
	    }
}
