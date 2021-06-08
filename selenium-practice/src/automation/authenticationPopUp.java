package automation;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class authenticationPopUp
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Drivers\\chromedriver_win32_91\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Handling Authentication popup
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		//Handling Child Browser
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> ids = new ArrayList<String>(id);
		String tab1=ids.get(1);
		driver.switchTo().window(tab1);
		driver.findElement(By.xpath("//a[text()='Sauce Labs']")).click();
		
	}

}
