package TestCases;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class StepDefinitions {

	ChromeDriver driver;
	
	
	@Given("User is on Login Page")
	public void User_is_on_Loginpage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Ss\\chromedriver_win32\\chromedriver.exe");
		
	 driver= new ChromeDriver();
		  driver.get("www.facebook.com");
		  
	}
	    @When("^User enter User name$")
	    public void User_enter_username() {
		driver.findElementById("email").sendKeys("9717189836");	
       
		}
	    @And("^User enter password$")
	    public void User_enter_password(){
	    	
	   driver.findElementByName("pass").sendKeys("admin@123");	
	    	
	    }
	    
	    @And("^User Clicks on Login button$")
	    public void User_click_on_login() {
			
	     driver.findElementByXPath("//input[@type='submit']").click();
	    	
	    	
		}
	
	
	
	
}
