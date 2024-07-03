package assertion_TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Google_Title 
{
    @Test
    public void title()
    {
    	ChromeDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.navigate().to("https://www.google.com/");
    	String actual_title=driver.getTitle();
    	String expected_title="Google";
    	Assert.assertEquals(actual_title, expected_title, "Title Mismatched");
    	driver.close();
    }
}
