package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager 
{

	public LandaingPage landaingPage;
	
	public OfferPage offerPage;
	
	public WebDriver driver;
	
	public CheckoutPage checkoutPage;
	 
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	 public LandaingPage getLandaingpage()
	 {
		 landaingPage= new LandaingPage(driver);
		 return landaingPage;
	 }
	  public OfferPage getOfferPage()
	  {
		  offerPage=new OfferPage(driver);
		  return offerPage;
	  }
	  
	  public CheckoutPage getCheckoutPage()
	  {
		  checkoutPage=new CheckoutPage(driver);
		  return checkoutPage;
	  }
	
}
