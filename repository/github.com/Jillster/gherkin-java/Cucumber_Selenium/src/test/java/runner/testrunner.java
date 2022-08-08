package runner;

import org.junit.runner.RunWith;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.*;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


//@RunWith(Cucumber.class)

//@CucumberOptions(
//features = "src/test/java/features",
//glue= "seleniumglue"


@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\jillk\\eclipse-workspace\\Cucumber_Selenium\\src\\test\\java\\features", //path of feature files"
	//glue= "C:\\Users\\jillk\\eclipse-workspace\\Cucumber_Selenium\\src\\test\\java\\seleniumglue"
				glue= "seleniumglue"
	)
		
public class testrunner {

}