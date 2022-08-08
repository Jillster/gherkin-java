package seleniumglue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

//https://www.toolsqa.com/selenium-cucumber-framework/design-webdriver-manager/
//https://www.selenium.dev/documentation/test_practices/encouraged/page_object_models/


public class test {
	WebDriver driver;
	 
	
	@Given("^user is on Home Page$")
	public void user_is_on_homepage(){	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jillk\\chromedriver.exe");	
	    ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/login");
	 }
	
	@When("^user enters username and Password$")
	public void UserName() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jillk\\chromedriver.exe");	
		//driver.findElement(By.id("login")).click();
		driver.findElement(By.id("userName")).sendKeys("testuser_1");
		driver.findElement(By.id("password")).sendKeys("Test@123");
		driver.findElement(By.id("login")).click();
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		 System.out.println("Login Successful"); 
	}
		 
	@Given("^user is logged in$")			
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.id("submit")).click();
	}
		 
	
	@Then("^Message displayed LogOut Successfully$")
	 public void message_displayed_LogOut_Successfully() throws Throwable {
        System.out.println("LogOut Successful");
        
	}
	}
   
  
	  
	

