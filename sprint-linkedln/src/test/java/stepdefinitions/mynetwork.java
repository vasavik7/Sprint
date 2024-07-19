package stepdefinitions;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.acceptcon;
import pagefactory.creatingevent;
import pagefactory.creatinggroup;
import pagefactory.nonexistentprofile;
import pagefactory.searchprofile;

public class mynetwork
{
	WebDriver driver=new ChromeDriver();
	searchprofile sp = new searchprofile(driver);
	@Given("User is logged into LinkedIn page")
	public void user_is_logged_into_linked_in_page() throws InterruptedException {		
	    String url="https://www.linkedin.com/login/";
	    driver.get(url);
	    sp.username("reddigreeshma@gmail.com");
	    sp.password("GREESHu@1217");
	    sp.submit();
	    Thread.sleep(20000);    
	}

	@When("User clicks on my network icon")
	public void user_clicks_on_my_network_icon() throws InterruptedException {
		sp.mynetwork();
		Thread.sleep(5000);
	}

	@When("User searches for a specific profile")
	public void user_searches_for_a_specific_profile() {
		sp.search();
	}

	@Then("It shows profile")
	public void It_shows_profile() {
	}
	
	creatinggroup cg=new creatinggroup(driver);
	@When("user navigates to groups page on LinkedIn")
	public void user_navigates_to_groups_page_on_linked_in() {
	    driver.get("https://www.linkedin.com/groups/");
	    
	}

	@When("User clicks on Create Group Button")
	public void user_clicks_on_create_group_button() throws InterruptedException {
		cg.group();
		Thread.sleep(10000);
	}

	@When("User fill Group Information")
	public void user_fill_group_information() {
		cg.grpinformation();
		cg.grpdescription();		
	    
	}

	@Then("Submit Create Group")
	public void submit_create_group() {
		cg.create();
	}
	
	creatingevent ce=new creatingevent(driver);
	@When("User navigates to event page on LinkedIn")
	public void user_navigates_to_event_page_on_linked_in() throws InterruptedException {
	    driver.get("https://www.linkedin.com/mynetwork/network-manager/events/");
	    Thread.sleep(5000);
	}

	@When("User clicks on Create Event Button")
	public void user_clicks_on_create_event_button() throws InterruptedException {
	    Thread.sleep(9000);
		ce.event();
	    Thread.sleep(5000);

	}

	@When("User fill Event Information")
	public void user_fill_event_information() throws InterruptedException {
		ce.eveinfo();
		ce.next();
	    Thread.sleep(5000);
	    ce.message();   
	}
	
	@Then("Submit Create Event")
	public void submit_create_event() {   
		ce.post();
	}
	
	nonexistentprofile np = new nonexistentprofile(driver);
	@When("User navigates to my network icon")
	public void user_navigates_to_my_network_icon() {
		np.network();

	}

	@When("User searches for a specific profile1")
	public void user_searches_for_a_specific_profile1() {
		np.searchbar();
	    
	}

	@Then("It shows no result found")
	public void it_shows_no_result_found() {
		
	    
	}
	
	acceptcon ac=new acceptcon(driver);
	@When("User navigates to manage invitations")
	public void user_navigates_to_manage_invitations() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.linkedin.com/mynetwork/invitation-manager/");
	    Thread.sleep(5000);
	}

	@When("User sees list of connections to accept")
	public void user_sees_list_of_connections_to_accept() {
		
	    
	}

	@Then("User accept the connections")
	public void user_accept_the_connections() throws InterruptedException {
		ac.accept();
		
	    
	}


}
