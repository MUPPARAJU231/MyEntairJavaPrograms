package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP_Facebook_regi
{
	@DataProvider(name="data_facebook")
	public Object[][] regi()
	{
		Object a [][]=new Object[5][5];

		a[0][0]="regena";
		a[0][1]="kasandra";
		a[0][2]="1234567891";
		a[0][3]="rgybxw";
		a[0][4]="F";

		a[1][0]="august";
		a[1][1]="ames";
		a[1][2]="1234567892";
		a[1][3]="lkjhg";
		a[1][4]="F";

		a[2][0]="elsa";
		a[2][1]="jeen";
		a[2][2]="1234567893";
		a[2][3]="zxcvb";
		a[2][4]="F";

		a[3][0]="giana";
		a[3][1]="Dior";
		a[3][2]="1234567894";
		a[3][3]="poiuy";
		a[3][4]="F";

		a[4][0]="Duoa";
		a[4][1]="lipa";
		a[4][2]="1234567895";
		a[4][3]="qwerty";
		a[4][4]="F";
		return a;
	}

	@Test(dataProvider = "data_facebook")
	public void registration(String fname,String sname,String mob,String pwd,String gen) throws InterruptedException
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement f_name=driver.findElement(By.name("firstname"));
		f_name.sendKeys(fname);
		WebElement s_name=driver.findElement(By.name("lastname"));
		s_name.sendKeys(sname);
		WebElement phno=driver.findElement(By.name("reg_email__"));
		phno.sendKeys(mob);
		WebElement pwd1=driver.findElement(By.name("reg_passwd__"));
		pwd1.sendKeys(pwd);
		Thread.sleep(3000);
		WebElement gender=driver.findElement(By.xpath("//label[.='Female']"));
		gender.click();

		driver.findElement(By.name("websubmit")).click();
		driver.quit();
	}
}
