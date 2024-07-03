package selenium_Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Facebook_LoginPage 
{
	//1.Locate Each Element using Findby Annotation
	WebDriver driver;
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbutton;
	//2.Create respective Methods to Perform Action
	public void un()
	{
		username.sendKeys("9063332478");
	}
	
	public void pwd()
	{
		password.sendKeys("AddChinna");
	}
	
	public void login()
	{
		loginbutton.click();
	}
	//3.Initialize Each Element using PageFactory Class inside the Constructor
	
	public Facebook_LoginPage(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
}
