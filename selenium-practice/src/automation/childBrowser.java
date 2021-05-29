package automation;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowser {

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Prepaid/Forex Card']")).click();


		}
}
