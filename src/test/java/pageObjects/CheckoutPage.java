package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage 
{
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}

	By cartBag=By.cssSelector("img[alt='Cart']");
    By checkOutButton=By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
    By promButton=By.cssSelector(".promoBtn");
    By placeOder=By.xpath("//button[contains(text(),'Place Order')]");

   
    public void checkOutItems()
    {
    	driver.findElement(cartBag).click();
    	driver.findElement(checkOutButton).click();
    }
     
    public Boolean verifyPromobttton()
    {
      return driver.findElement(promButton).isDisplayed();
    }
    
    public Boolean verifyPlaceorder()
    {
    	return driver.findElement(placeOder).isDisplayed();
    }
   
   
  
   
}
