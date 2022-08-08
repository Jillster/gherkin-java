package Cucumber_Selenium.Cucumber_Selenium;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
			
		public static WebDriver driver;
		public static void main(String[] args) {
		
		
	 		System.setProperty("webdriver.chrome.driver","C:\\Users\\jillk\\chromedriver.exe");
			 ChromeDriver driver = new ChromeDriver();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		     driver.get("http://demoqa.com/books");	

		     driver.findElement(By.id("login")).click();			
		    driver.findElement(By.id("userName")).sendKeys("testuser_1");
			driver.findElement(By.id("password")).sendKeys("Test@123");
			driver.findElement(By.id("login")).click();

			System.out.println("Login Successful"); 
				 
			driver.findElement (By.id("submit")).click();

	 		   System.out.println("LogOut Successful");
	 		   
	 		   
		}
		  
		}

