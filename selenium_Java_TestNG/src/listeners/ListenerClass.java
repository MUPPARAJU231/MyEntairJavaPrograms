package listeners;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerClass implements ITestListener
{
	static RemoteWebDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("TestStarted");
		Reporter.log("onTestStart");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		TakesScreenshot a1= driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\Pass\\"+"pass"+Math.random()+".png");
		try 
		{
			FileHandler.copy(source, destination);
		} catch (IOException e)
		{
			e.printStackTrace();
		}	
		Reporter.log("Test case Ppassed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Test case Ffailed");
		System.out.println("Failed");
		TakesScreenshot a1=  driver;
		File source=a1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\Fail\\"+"fail"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("Skipped");
		Reporter.log("onTestSkipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		System.out.println("Timeout");
		Reporter.log("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("onStart");
		Reporter.log("onStart");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("onFinish");
		System.out.println("onFinish");
	}
}
