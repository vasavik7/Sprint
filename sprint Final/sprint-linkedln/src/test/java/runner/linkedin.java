package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="stepdefinitions",
		plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:")

public class linkedin{

}
