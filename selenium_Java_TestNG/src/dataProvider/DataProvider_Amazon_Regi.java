package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Amazon_Regi
{
	@DataProvider()
	public Object[][] regi()
	{
		Object a [][]=new Object[5][3];
		
		a[0][0]="regena";
		a[0][1]="1234567890";
		a[0][2]="lkdasdf";
		
		a[1][0]="raveena";
		a[1][1]="123456781";
		a[1][2]="xcvasdfg";
		
		a[2][0]="chloe";
		a[2][1]="1234567892";
		a[2][2]="poqasdf";
		
		a[3][0]="elsa";
		a[3][1]="1234567893";
		a[3][2]="asdfyui";
		
		a[4][0]="august";
		a[4][1]="1234567894";
		a[4][2]="asdfwer";
		return a;
	}
	
	@Test(dataProvider = "regi")
	public void registration(String name,String ph,String pwd)
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_ya_signin%26adgrpid%3D155259813513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540019%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D13298992640119046696%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062141%26hvtargid%3Dkwd-365295376496%26hydadcr%3D5620_2359471%26gad_source%3D1&prevRID=V8SD0K229Q9SK5TQVB32&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement name1=driver.findElement(By.name("customerName"));
		name1.sendKeys(name);
		WebElement phno=driver.findElement(By.id("ap_phone_number"));
		phno.sendKeys(ph);
		WebElement pwd1=driver.findElement(By.id("ap_password"));
		pwd1.sendKeys(pwd);
		driver.findElement(By.id("continue")).click();
		driver.quit();
	}
}
