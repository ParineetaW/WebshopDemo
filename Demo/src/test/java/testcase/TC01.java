package testcase;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pages.Account;
import pages.HomePage;
import pages.Login;
import testbase.WebTestBase;



public class TC01 extends WebTestBase {
	Login loginpage;	
	HomePage homepage;
	Account AccountPage;
	

	public TC01() {
		super();
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		//Loading the driver file and establishing the connection ,loading the url
	initialization();
	loginpage = new Login();
	homepage=new HomePage();
	AccountPage = new Account();
	
}
	@Test
	public void VerifyLogin()
	{
		SoftAssert softAssert = new SoftAssert();
		homepage.userSearchClick();
	     loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	     System.out.println("verifyLogin");
	     softAssert.assertAll();
	   // softAssert.assertEquals(AccountPage.getTextOFMYAccountPage(), "My Account", "My Account text should be match");
	     System.out.println("Hello, This is my Account Page");
	    
	}
	@Test
	public void verifyScrollDown() {
	SoftAssert softAssert =new SoftAssert();
	AccountPage.scrollDownMethod();
		softAssert.assertAll();
	}

	@Test
	public void verifyMouseHover() {
		SoftAssert softAssert =new SoftAssert();
		homepage.userSearchClick();
		loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
		AccountPage.mouseHover();
		softAssert.assertAll();
	}
	
	@Test
	public void verifySearchBar() throws InterruptedException{
	     SoftAssert softAssert = new SoftAssert();
	     homepage.userSearchClick();
			loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
	     AccountPage.search();
	  
	     System.out.println("Search has been passed");
	
     softAssert.assertAll();
	}
	
	@Test
	public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
       AccountPage.windowHandle();
       softAssert.assertAll();
   }
	@Test
	public void verifyCookiesHandle(){
       SoftAssert softAssert = new SoftAssert();
       AccountPage.getCookiesHandle();
       softAssert.assertAll();
    }
	

	@AfterMethod
	public void afterMethod() {
    driver.close();
}	
}

