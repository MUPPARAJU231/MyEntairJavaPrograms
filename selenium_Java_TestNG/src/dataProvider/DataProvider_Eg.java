package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Eg 
{
    @DataProvider(name="data1")
    public Object method1()
    {
    	return new Object[][] {{"ram"},{"ravi"},{"raju"}};
    }
	
	@Test(dataProvider = "data1")
	public void testcase1(String name)
	{
		System.out.println(name.concat(" Mupparaju"));
	}
}