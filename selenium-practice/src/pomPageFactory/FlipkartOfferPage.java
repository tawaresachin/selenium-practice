package pomPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartOfferPage 
{
	@FindBy(xpath="(//div[@class='_331-kn _2tvxW']//a//div[@class='xtXmba'])[1]") private WebElement offer;
	@FindBy(xpath="(//div[@class='_331-kn']//span)[1]") private WebElement menue;
	@FindBy(xpath="(//div[@class='_1QrT3s']//a[contains(text(),'Mobiles')])[1]") private WebElement mobile;
	
	public FlipkartOfferPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnTopOfferOnFlipkart() throws InterruptedException
	{
		Thread.sleep(2000);
		offer.click();
	}
	
	public void hoverOnElectronicsOnFlipkart(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(menue).perform();
		
	}
	public void selectMobilesFromElectronicsOnFlipkart() throws InterruptedException
	{
		Thread.sleep(2000);
		mobile.click();
	}
	
	public void QuitBrowser(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
