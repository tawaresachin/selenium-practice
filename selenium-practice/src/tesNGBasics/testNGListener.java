package tesNGBasics;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class testNGListener
{
	WebDriver driver;
	String TCID;
	
	@BeforeClass
	public void setUP()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	@BeforeMethod
	public void syncTest() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	@Test
	public void facebookLoginUser()
	{
		TCID="TC001";
		WebElement user =driver.findElement(By.xpath("//input[@id='emai']"));
		boolean result=user.isEnabled();
		if(result==true)
		{
			user.sendKeys("9096349923");			
		}
		Assert.assertEquals(result,true,"User field is disabled");
		
	}
	
	@Test (dependsOnMethods="facebookLoginUser")
	public void facebookLoginPassword()
	{
		TCID="TC002";
		WebElement password =driver.findElement(By.xpath("//input[@id='pass']"));
		boolean result=password.isEnabled();
		if(result==true)
		{
			password.sendKeys("9096349923");			
		}
		Assert.assertEquals(result,true,"User field is disabled");
	}
	
	@AfterMethod
	public void testListner(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			System.out.println("Test case "+TCID+" is failed");
			File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("D:\\Study\\Testing Class\\local\\selenium-practice\\test-output\\Screenshots\\"+TCID+".jpeg");
			FileHandler.copy(scr, dest);
		}
		
		if(ITestResult.SUCCESS==result.getStatus())
		{
			System.out.println("Test case "+TCID+" is passed");
		}
		
		if(ITestResult.SKIP==result.getStatus())
		{
			System.out.println("Test case "+TCID+" is skipped");
		}
	}
	
	@AfterClass
	public void finish()
	{
		driver.close();
		driver.quit();
	}

}
