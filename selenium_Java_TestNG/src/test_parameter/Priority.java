package test_parameter;

import org.testng.annotations.Test;

public class Priority 
{
     @Test(priority=-1)
     void add()
     {
    	 System.out.println("1");
     }
     @Test(priority=1)
     void sub()
     {
    	 System.out.println("2");
     }
     @Test(priority=0)
     void mul()
     {
    	 System.out.println("3");
     }
}
