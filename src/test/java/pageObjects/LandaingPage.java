package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandaingPage 
{
	public WebDriver driver;
	public LandaingPage(WebDriver driver)
	{
		this.driver=driver;
	}

   By search=By.xpath("//input[@type='search']");
   By prodcutname=By.cssSelector("h4.product-name");
   By topDetails=By.linkText("Top Deals");
   By increment=By.cssSelector("a.increment");
   By addToCart=By.cssSelector(".product-action button");
   
   
   public void searchItem(String name)
   {
	   //testContextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    driver.findElement(search).sendKeys(name);
	  
   }
    public void getSearchText()
    {
    	driver.findElement(search).getText();
    }
    public String getProductName()
    {
    	return driver.findElement(prodcutname).getText();
    }
    
    public void selectToppageDetails()
    {
    	driver.findElement(topDetails).click();
    }
     public String getLandingPageTitle()
     {
    	return driver.getTitle(); 
     }
      
     //quantity
     
     public void incrementQuntity(int quntiity)
     {
    	 int i=quntiity - 1;
    	 while(i > 0)
    	 {
    		  driver.findElement(increment).click();
    		 i--;
    	 }
    	 
     }
     
     //add to cart
     
     public void addToCart()
     {
    	 driver.findElement(addToCart).click();
     }
  
   
}
