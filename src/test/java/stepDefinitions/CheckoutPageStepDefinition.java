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
import pageObjects.CheckoutPage;
import pageObjects.LandaingPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
	public WebDriver driver;
	public String landingpageproductname;
	public String offerlproductpage;
	TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;
	
	//Spring frmework
	//srp
	public CheckoutPageStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
	}
	
	@Then("Verify user ability to enter promo code and place the order")
	public void user_ability_to_enter_promo_code()
	{
		
		Assert.assertTrue(checkoutPage.verifyPromobttton());
		Assert.assertTrue(checkoutPage.verifyPlaceorder());
	
	}
	@Then("^user proceeds to Checkout and validate the (.+) item in checkout page$")
	public void user_proceeds_to_checkout(String name)
	{
		checkoutPage.checkOutItems();
		
		//asseartion  to extract  name from  screen and compare with name
	}

}
