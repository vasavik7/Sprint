package pagefactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class acceptcon {
	WebDriver driver;
	public acceptcon(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class='artdeco-button artdeco-button--2 artdeco-button--secondary ember-view invitation-card__action-btn']//child::span")
	WebElement acpt;
	
	public void accept()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",acpt);
	}
	

}
