package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Amazon_Login 
{
	@DataProvider(name="login_details")
	public Object method1()
	{
		Object[][] d1=new Object[4][2];
		d1[0][0]="stbymkt@gmail.com";
		d1[0][1]="adfkj";
		d1[1][0]="veer@gmail.com";
		d1[1][1]="asdf";
		d1[2][0]="raju123@gmail.com";
		d1[2][1]="qwert";
		d1[3][0]="ravi12@gmail.com";
		d1[3][1]="poiu12";
		return d1;
	}
	
    @Test(dataProvider = "login_details")
    public void launch(String un, String pwd)
    {
    	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys(un);
		WebElement continue_btn=driver.findElement(By.xpath("//input[@id='continue']"));
		continue_btn.click();
		WebElement psw=driver.findElement(By.xpath("//input[@id='ap_password']"));
		psw.sendKeys(pwd);
		WebElement signin_btn=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin_btn.click();
	    driver.quit();
    }
}
