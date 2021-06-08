package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_practice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Testing%20Class/2.%20Automation%20Testing/sampleHTML/sample5.html");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		 driver.switchTo().frame(1);
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		 driver.switchTo().parentFrame();
		 driver.switchTo().frame("accept");
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		 
		 //driver.switchTo().parentFrame();
		 driver.switchTo().defaultContent();
		 driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sachin");
		 
		Thread.sleep(3000);
		
		driver.quit();

	}

}
