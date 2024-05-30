package basic_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_JSAM 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Downloads/learningHTML1.html");
		WebElement lname=driver.findElement(By.id("121"));
		System.out.println(lname.isEnabled());
		WebElement m_radio=driver.findElement(By.xpath("//input[@type='radio']"));
		boolean b = m_radio.isSelected();
        if(b==true)
        {
        	System.out.println("Its Selected");
        }
        else
        {
        	System.out.println("Its not Selected");
        	m_radio.click();
        	System.out.println("I have Selected it Now");
        }
		
	}
}
