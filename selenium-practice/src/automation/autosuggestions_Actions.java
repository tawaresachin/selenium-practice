package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autosuggestions_Actions {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("https://www.google.co.in/");
		WebElement input = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		
		Actions action=new Actions(driver);
		action.moveToElement(input).click().keyDown(Keys.SHIFT).sendKeys("covid").keyUp(Keys.SHIFT).build().perform();
		List<WebElement> sugg = driver.findElements(By.xpath("//span[text()='covid']"));
		int size = sugg.size();
		for(int i=1;i<size;i++)
		{
			WebElement firstEle = driver.findElement(By.xpath("(//span[text()='covid'])[1]"));
			action.moveToElement(firstEle).sendKeys(Keys.ARROW_DOWN).build().perform();
			if(i==6)
			{
				
				action.sendKeys(Keys.ENTER).build().perform();
				break;
			}
			Thread.sleep(2000);
		}
		
		WebElement ele=driver.findElement(By.xpath("//div[text()='Statistics']"));
		
		action.contextClick().build().perform();
		Thread.sleep(2000);
//		action.moveByOffset(100, 200).build().perform();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
