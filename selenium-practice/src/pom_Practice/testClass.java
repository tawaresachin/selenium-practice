package pom_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe" );
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.facebook.com/");
		
		pageClass page=new pageClass(driver);
		
		String user="Sachin Taware";
		String pass="25051988";
		
		page.setUserNameonLoginPage(user);
		Thread.sleep(3000);
		page.setPasswordonLoginPage(pass);
		Thread.sleep(3000);
		page.clickLoginButtonOnLoginPage();
		Thread.sleep(3000);
		page.quitFromLoginPage(driver);
		
	}

}
