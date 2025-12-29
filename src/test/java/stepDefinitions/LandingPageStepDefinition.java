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
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	public String landingpageproductname;
	public String offerlproductpage;
	TestContextSetup testContextSetup;
	LandaingPage landingpage;
	
	//Spring frmework
	//srp
	public LandingPageStepDefinition(TestContextSetup testContextSetup)
	{
     this.testContextSetup=testContextSetup;
	 this.landingpage=testContextSetup.pageObjectManager.getLandaingpage();
	}
	@Given("User is on Greencart Landing page")
	public void user_is_on_greencart_landing_page() 
	{
		//testContextSetup.driver=new ChromeDriver();
		//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Assert.assertTrue(landingpage.getLandingPageTitle().contains("GreenKart"));
	}
	@When("^user searched with Shortname (.+) extract actual name of product$")
	public void user_searched_with_shortname_extract_actual_name_of_product(String shortName) throws InterruptedException {
	   
	
		//testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		
		landingpage.searchItem(shortName);
		
		Thread.sleep(2000);
		//testContextSetup.landingpageproductname=testContextSetup.driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		testContextSetup.landingpageproductname=landingpage.getProductName().split("-")[0].trim();
		System.out.println(landingpageproductname + " is extract form home page");

	    
	}
	@When("Added {string} items of the selected product to cart")
	public void added_items_product_cart(String quantity)
	{
		landingpage.incrementQuntity(Integer.parseInt(quantity));
		landingpage.addToCart();
	}
	
	


}
