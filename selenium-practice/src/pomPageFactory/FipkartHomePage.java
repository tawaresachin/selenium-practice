package pomPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FipkartHomePage 
{
	
	private static final FlipkartOfferPage FlipkartOfferPage = null;
	@FindBy(xpath="(//div[@class='_1psGvi _3BvnxG']//div)[2]") private WebElement profile;
	@FindBy(xpath="(//div[@class='_1psGvi _3BvnxG']//div)[6]//ul//li//a//div") private WebElement myProfile;
	@FindBy(xpath="(//div[@class='_37M3Pb']//div//div)[6]") private WebElement grocery;
	
	public FipkartHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void GetFlipkartHomePageTitle(WebDriver driver)
	{
		String ttl=driver.getTitle();
		System.out.println("Title of homePage is: "+ttl);
		System.out.println("test1");
	}
	
	public void ClickMyProfileOnFlipkartHomePage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(profile).perform();
		Thread.sleep(2000);
		myProfile.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
	
	public FlipkartOfferPage ClickGroceryOnFlipkartHomePage(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		grocery.click();
		Thread.sleep(2000);
		driver.navigate().back();
		return FlipkartOfferPage;
	}
}
