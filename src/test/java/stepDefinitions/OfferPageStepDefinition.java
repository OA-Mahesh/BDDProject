package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandaingPage;
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	public WebDriver driver;
	public String landingpageproductname;
	public String offerlproductpage;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	//single responsiblitiy prinicap SRP
		//loosly coupled
	//factory design pattern
	
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
	@Then("^user searched for (.+) shortname in offer page$")
	public void user_searched_for_shortname_in_offer_page(String shortName) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		switchToofferpage();
		//OfferPage offerpage=new OfferPage(testContextSetup.driver);
		OfferPage offerpage=testContextSetup.pageObjectManager.getOfferPage();
		offerpage.searchItem(shortName);
		Thread.sleep(2000);
		  //offerlproductpage = testContextSetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	
		offerlproductpage=offerpage.getProductName();
	}
	public void switchToofferpage()
	{
		//if switched offer page --> skip below part
		//if(testContextSetup.driver.getCurrentUrl().equalsIgnoreCase(""));
		
		//pageObjectManager=new PageObjectManager(testContextSetup.driver);
		
		//LandaingPage landingpage=pageObjectManager.getLandaingpage();
		LandaingPage landingpage=testContextSetup.pageObjectManager.getLandaingpage();
		
		
		landingpage.selectToppageDetails();
		//testContextSetup.driver.findElement(By.linkText("Top Deals")).click();
		testContextSetup.genericUtils.SwitchWindowToChild();
		
	}
	@Then("validated product name in offer page matches with Landing page")
	public void validated_product_name_in_offer_page_matches_with_Landing_page()
	{
		 Assert.assertEquals(offerlproductpage, testContextSetup.landingpageproductname);
	}


}
