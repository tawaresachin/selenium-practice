package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorPractice {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///D:/Testing%20Class/2.%20Automation%20Testing/sampleHTML/sample4.html");
		
		// Difference findElement v/s findElements
		
		//1. To perform operation on unique/single webelement use--> driver.findElement
		WebElement ele = driver.findElement(By.tagName("input"));
		ele.sendKeys("Sachin");
		Thread.sleep(1000);
		ele.clear();
		Thread.sleep(1000);
		String str = ele.getText();
		System.out.println(str);
		
		//optimization of actions
		driver.findElement(By.id("pass")).sendKeys("8999377346");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(1000);
		
		//2. To perform operation on specific webelement out of List of Web-elements use--> driver.findElements
		List<WebElement> ele1 = driver.findElements(By.tagName("input"));
		Thread.sleep(1000);
		WebElement sele = ele1.get(3);		//address specific webelement
		Thread.sleep(1000);
		sele.sendKeys("9096349923");
		Thread.sleep(1000);
		sele.clear();
		
//--------------------------------------------------------------------------------------
		//Locators 1.tagname()
		
		WebElement ele2 = driver.findElement(By.tagName("input"));
		ele2.sendKeys("Prashant");
		
		//Locators 2.id()
		
		WebElement ele3 = driver.findElement(By.id("contact"));
		ele3.sendKeys("123456789");
		
		//Locators 3.name()
		
		WebElement ele4 = driver.findElement(By.name("email"));
		ele4.sendKeys("sachin.2551988@gmail.com");
		
		//Locators 4.className()
		WebElement ele5 = driver.findElement(By.className("password"));
		ele5.sendKeys("abcde12345");
		
		//Locators 5.linkText()
		WebElement ele6 = driver.findElement(By.linkText("SinUp"));
		ele6.click();
		driver.navigate().back();
		
		//Locators 6.partialLinkText()
		WebElement ele7 = driver.findElement(By.partialLinkText("Terms"));
		ele7.click();
		driver.navigate().back();
		
		//Lacator 7. xpath- Relative
		WebElement ele8=driver.findElement(By.xpath("(//html//input)[9]"));
		ele8.click();
		
		Thread.sleep(5000);
		driver.quit();		
		

	}

}
