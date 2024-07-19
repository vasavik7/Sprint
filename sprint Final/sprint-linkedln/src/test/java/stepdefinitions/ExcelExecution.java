package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelExecution {
	WebDriver driver = new ChromeDriver();
	@Test(dataProvider = "mynetwork" , dataProviderClass = ExcelDataProvider.class)
	public  void TestExcel(String email,String passwords)
	{
	driver.get("https://www.linkedin.com/login/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys(email);
	driver.findElement(By.id("password")).sendKeys(passwords);
	driver.findElement(By.xpath("//button[@type='submit']")).click();    
	}

}
