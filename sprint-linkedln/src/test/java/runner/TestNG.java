package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="features",
		glue="stepdefinitions")		
//		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")
//				"pretty","junit:target/cucumberReports.xml","json:target/cucumberReports.json"})
//		plugin= {"pretty","html:target/cucumber.html"})

public class TestNG extends AbstractTestNGCucumberTests{
	

}
