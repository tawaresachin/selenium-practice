package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Testing%20Class/2.%20Automation%20Testing/sampleHTML/sample2.html");
		
		WebElement ele1 = driver.findElement(By.tagName("input"));
		ele1.sendKeys("Sachin");
		

	}

}
