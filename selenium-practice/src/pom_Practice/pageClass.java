package pom_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageClass 
{
	private WebElement email; 
	private WebElement password;
	private WebElement login;

	public pageClass(WebDriver driver)
	{
		email = driver.findElement(By.xpath("//input[@id='email']"));
		password=driver.findElement(By.xpath("//input[@id='pass']"));
		login=driver.findElement(By.xpath("//button[@name='login']"));
	}
	
	public void setUserNameonLoginPage(String user )
	{
		email.sendKeys(user);
	}
	
	public void setPasswordonLoginPage(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void clickLoginButtonOnLoginPage()
	{
		login.click();
	}
	
	
	public void quitFromLoginPage(WebDriver driver)
	{
		driver.quit();
	}
}
