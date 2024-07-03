package listeners;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listeners.ListenerClass.class)
public class TestCase extends ListenerClass
{
	@Test
	public void  testcase1()
	{
		 driver=new ChromeDriver();
		System.out.println("testcase1 method");
		assertTrue(true);
	}
	@Test
	public void  testcase2()
	{
		System.out.println("testcase2 method");
		assertTrue(false);
	}
	@Test(timeOut = 1000)
	public void  testcase3() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("testcase3 method");
	}
	@Test(dependsOnMethods = "testcase3")
	public void  testcase4()
	{
		System.out.println("testcase4 method");
	}
}
