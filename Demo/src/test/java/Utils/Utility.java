package Utils;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends WebTestBase{

	public static void selectValue(WebElement element, String term, String value) {
		// TODO Auto-generated method stub
		Select dropDown=new Select(element);
		if(term.equalsIgnoreCase("byValue")){
            dropDown.selectByValue(value);
        }else if(term.equalsIgnoreCase("byIndex")){
            dropDown.selectByIndex(Integer.parseInt(value));
        }else if(term.equalsIgnoreCase("byVisibleText")){
            dropDown.selectByVisibleText(value);
        }else{
            System.out.println("Please select the correct value");
        }
	}

	public static void mouseHover(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	 public static void conTextClick(WebDriver driver, WebElement searchBoxfield){
	       Actions action=new Actions(driver);
	       action.contextClick(searchBoxfield).build().perform();
	       new WebDriverWait(driver,Duration.ofSeconds(10));        
	   }


	public static void scrollDownByElement(WebDriver driver, WebElement element) {
		// TODO Auto-generated method stub
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element );
		js.executeScript("window.scrollBy(0,2000)");
	}

	 public static void switchToWindows(WebDriver driver) {
       String parentWindows = driver.getWindowHandle();
       Set<String> allWindow = driver.getWindowHandles();
       for (String s : allWindow) {
           if (!parentWindows.contentEquals(s)) {
               driver.switchTo().window(s);
               driver.close();
           }
           driver.switchTo().window(parentWindows);
       }
   }

	public static void getCookies() {
		// TODO Auto-generated method stub
		Set<Cookie> cookies=driver.manage().getCookies();
		for(Cookie c : cookies)
		{
			System.out.println(c);
		}
	}
	

}

