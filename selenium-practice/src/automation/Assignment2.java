package automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
//	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
//	FluentWait wait=new FluentWait(driver);
//	wait.withTimeout(2000, TimeUnit.MILLISECONDS);
//	wait.pollingEvery(30, TimeUnit.MILLISECONDS);
//	wait.ignoring(NoSuchElementException.class);
//	wait.until(ExpectedConditions.alertIsPresent());
//	WebDriverWait wait=new WebDriverWait(driver,2,30);
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MICROSECONDS);
	
	//xpath -1. by absolute path
	WebElement ele1=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div[1]/form/div[5]/a"));
	ele1.click();

	//xpath -2. by relative path
	Thread.sleep(5000);
	WebElement ele2 = driver.findElement(By.xpath("(//form//input)[9]"));
	ele2.sendKeys("Sachin");
	
	//xpath -3. by attribute
	WebElement ele3 = driver.findElement(By.xpath("//input[@name='lastname']"));
	ele3.sendKeys("Taware");
	
	//xpath -4. by index
	WebElement ele4 = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]"));
	ele4.sendKeys("sachintaware.2551988@gmail.com");
	
	WebElement ele5 = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
	ele5.sendKeys("sachintaware.2551988@gmail.com");
	
	WebElement ele6 = driver.findElement(By.xpath("//input[@id='password_step_input']"));
	ele6.sendKeys("9096349923");
	
	//xpath -5. by text()
	WebElement ele7=driver.findElement(By.xpath("//option[text()='25']"));
	ele7.click();
	
	//xpath -6. by contains
	WebElement ele8 = driver.findElement(By.xpath("//option[contains(text(),'May')]"));
	ele8.click();
	
//	//Method-1 to handle dropdown
//	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
//	month.click();
//	month.sendKeys("May");
//	month.click();
	
//  //Method-2 to handle dropdown using 'Select' method
	WebElement ele9=driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select sel=new Select(ele9);
	//sel.selectByIndex(1);
	//sel.selectByValue("2019");
	sel.selectByVisibleText("1988");
	
	
//	// To show all options of dropdown
//	List<WebElement> options = sel.getOptions();
//	System.out.println("Size of year dopdown: "+options.size());
//	int size=options.size();
//	for(int i=0;i<size;i++)
//	{
//		String str=options.get(i).getText();
//		System.out.println(str);
//	}
//	//to get first/default selected option if multi-select is allowed
//	WebElement ele10 = sel.getFirstSelectedOption();
//	String str1 = ele10.getText();
//	System.out.println("First selected option is: "+str1);
//	//to check if multi-select is allowed?
//	boolean flag = sel.isMultiple();
//	System.out.println("If multiple values are selected? :"+flag);
	

	
	Thread.sleep(5000);
	driver.quit();
	

	}

}
