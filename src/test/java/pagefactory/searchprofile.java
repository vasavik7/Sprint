package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchprofile {
	WebDriver driver;
	public searchprofile(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="username")
	WebElement name;
	
	@FindBy(id="password")
	WebElement pw;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement lg;
		
	@FindBy(xpath="//span[@title='My Network']")
	WebElement mn;
	
	@FindBy(xpath="//input[@role='combobox']")
	WebElement srh;
	
	public void username(String string)
	{
		name.sendKeys(string);
	}
	public void password(String string)
	{
		pw.sendKeys(string);
	}
	public void submit()
	{
		lg.click();
	}
	public void mynetwork()
	{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",mn);
		
	}
	public void search()
	{
		srh.sendKeys("kalwa roja");
	    srh.sendKeys(Keys.ENTER);
	}
	

}
