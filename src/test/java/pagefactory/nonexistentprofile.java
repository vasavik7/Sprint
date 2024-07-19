package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class nonexistentprofile {
	WebDriver driver;
	public nonexistentprofile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[@title='My Network']")
	WebElement net;
	
	@FindBy(xpath="//input[@role='combobox']")
	WebElement sah;
	
	public void network()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",net);
		
	}
	
	public void searchbar()
	{
		sah.sendKeys("vasunaidukaranam");
	    sah.sendKeys(Keys.ENTER);
	}

}
