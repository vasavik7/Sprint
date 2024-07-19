package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingevent {
	WebDriver driver;
	public creatingevent(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@class=\"artdeco-button artdeco-button--2 artdeco-button--tertiary ember-view\"]//child::span")
	WebElement eve;
	
	@FindBy(xpath="//input[@class=\" artdeco-text-input--input\" and @id=\"ef-form__name\"]")
	WebElement evename;
	
	@FindBy(xpath="//button[@class=\"artdeco-button artdeco-button--2 artdeco-button--primary ember-view\"]//child::span")
	WebElement nxt;
	
	@FindBy(xpath="//div[@class='ql-editor ql-blank']//child::p")
	WebElement mssg;
	
	@FindBy(xpath="//button[@class=\"share-actions__primary-action artdeco-button artdeco-button--2 artdeco-button--primary ember-view\"]//child::span")
	WebElement pst;
	
	public void event()
	{
		eve.click();
	}
	public void eveinfo()
	{
		evename.sendKeys("linkedin meeting1");
	}
	public void next()
	{
		nxt.click();
	}
	public void message()
	{
		mssg.sendKeys("LinkedIn Description");
	}
	public void post()
	{
		pst.click();
	}

}
