package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;

	public class Login extends WebTestBase{	
		
		 @FindBy(id = "Email")
		    WebElement emailTextBox;

		    @FindBy(id = "Password")
		    WebElement passwordTextBox;

		    @FindBy(xpath="/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")
		    WebElement loginbtn;
		    //@ FindBy(xpath="//div[@class='_6S9iN _WHF4f']")
		    //WebElement courseTextBox;
	   
		    
		    public Login(){
		        PageFactory.initElements(driver, this);
		    }
	//sending the email and passwrord to the login
		    public void login(String email, String password){
		        emailTextBox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		      
		        
		        
		    }
			
	}