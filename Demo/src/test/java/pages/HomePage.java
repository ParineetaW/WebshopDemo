package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.WebTestBase;

public class HomePage extends WebTestBase{
	@FindBy(xpath= "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement login;
	

    public HomePage(){
    
        PageFactory.initElements(driver, this);
    }

    public void userSearchClick(){
        login.click();
    }
}