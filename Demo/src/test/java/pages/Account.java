package pages;
import Utils.Utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;

public class Account extends WebTestBase{
	 @ FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a")
	 WebElement Jewelry;
	
	 @FindBy(xpath="/html/body/div[4]/div[1]/div[2]/ul[1]/li[3]/a")
     WebElement hover;
   		           		          
    @FindBy(xpath="/html/body/div[4]/div[2]/div[1]/div[4]/ul/li[1]/a")
    WebElement facebook;
     
    @FindBy(id="small-searchterms")
    WebElement searchtext;
    
    @FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")
    WebElement searchBtn;
    
    @FindBy(xpath ="//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[1]/h1")
    WebElement Title;
    
    @FindBy(xpath = "//*[@id=\"ui-id-14\"]")
    WebElement dropDown;
    
    public Account(){
   	 PageFactory.initElements(driver, this);
    }
    
    public void scrollDownMethod() {
        Utility.scrollDownByElement(driver, facebook);
     facebook.click();
        }
    
  public void mouseHover(){
	   Utility.mouseHover(driver,hover);
	   hover.click();
	   }
 

    public void search () throws InterruptedException{
    	Thread.sleep(3000);
    	 searchtext.click();
    	 searchtext.sendKeys("Health book");
    	 Actions act = new Actions(driver);
    	 act.sendKeys(Keys.ENTER).perform();
    	// searchtext.sendKeys(Keys.ENTER);
    	// searchBtn.click();
    }
    
    public String getTitleText() {
   	 return Title.getText();
  
		
    }

   public void windowHandle(){
       Utility.scrollDownByElement(driver, facebook);
       facebook.click();
       Utility.switchToWindows(driver);
   }


    public void getCookiesHandle(){
   	 Utility.getCookies();
     }	
}
