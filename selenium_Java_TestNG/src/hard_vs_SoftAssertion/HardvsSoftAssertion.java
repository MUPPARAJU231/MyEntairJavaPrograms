package hard_vs_SoftAssertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class HardvsSoftAssertion
{
	@Test
	public void assertion()
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("veer", Keys.ENTER);

		SoftAssert a1= new SoftAssert();
		Assertion a2=new Assertion();
       
		//Title assertion		
		String actualTitle=driver.getTitle();
		String expectedTitle="Log in to Facebook";
		a1.assertEquals(actualTitle, expectedTitle, "Title Mismatched with SoftAssertion");
		
		//URL Assertion
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.facebook.com/";
		a2.assertNotEquals(actualUrl, expectedUrl, "URL Mismatched");
		
		//Text Assertion
		String actualText=driver.findElement(By.name("email")).getAttribute("value");
		String expectedText="";
		a2.assertEquals(actualText, expectedText, "Text Mismatched");
		
		//Boarder Assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="1px solid rgb(240, 40, 73)";
		a1.assertEquals(actualBorder, expectedBorder, "UserName Border Mismatched");
		
		//errorMessage Assertion
		String actuaErrorMessage=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
		String expectedErrorMessage="TThe email address or mobile number you entered isn't connected to an account. Find your account and log in.";
		a1.assertEquals(actuaErrorMessage, expectedErrorMessage, "UserName ErrorMessage Mismatched");
		
		driver.quit();
		a1.assertAll();
	}
}
