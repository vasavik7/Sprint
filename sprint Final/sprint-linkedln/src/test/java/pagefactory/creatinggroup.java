package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class creatinggroup {
	WebDriver driver;
	public creatinggroup(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class=\"groups-listing__create-group artdeco-button artdeco-button--2 artdeco-button--secondary ember-view\"]//child::span")
	WebElement grp;
	
	@FindBy(xpath="//input[@class=\" artdeco-text-input--input\"  and @id=\"group-name-txt-field\"]")
	WebElement grpinfo;
	
	@FindBy(xpath="//textarea[@class='groups-group-info-inputs__textarea artdeco-text-input--input artdeco-text-input__textarea' and @id='group-description-txt-field']")
	WebElement grpdes;
	
	@FindBy(xpath="//button[@class=\"artdeco-button artdeco-button--2 artdeco-button--primary ember-view\"]//child::span")
	WebElement crt;
	
	public void group()
	{
		grp.click();
	}
	public void grpinformation()
	{
		grpinfo.sendKeys("sprint2");
	}
	public void grpdescription()
	{
		grpdes.sendKeys("sample sprint group");
	}
	public void create()
	{
		crt.click();
	}

}
