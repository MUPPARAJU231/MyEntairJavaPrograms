package amazon_Scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login_Page 
{
	 WebDriver driver;
     @FindBy(id="ap_email")
	 WebElement username;
     @FindBy(id="continue")
	 WebElement continue_btn;
     @FindBy(id="ap_password")
	 WebElement password;
     @FindBy(id="signInSubmit")
	 WebElement signin_btn;
     
     public void un()
     {
    	 username.sendKeys("9063332478");
     }
     public void continue_click()
     {
    	 continue_btn.click();
     }
     public void pwd()
     {
    	 password.sendKeys("AddChinna");
     }
     public void signin()
     {
    	 signin_btn.click();
     }
   
   public Amazon_Login_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
     
}
