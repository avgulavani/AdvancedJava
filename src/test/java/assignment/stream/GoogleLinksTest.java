package assignment.stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functional.supplier.DriverFactory;

public class GoogleLinksTest {
	
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver=DriverFactory.getDriver(browser);
	}
	
	
	// do not allow blank links
	// do not allow links containing "s"
	// convert link test to uppercase
	// print on the console


	@Test	
	public void openGoogle() {
		
		this.driver.get("https://google.com/");
		this.driver.findElements(By.tagName("a"))    // List<WebElement>
					.stream()                        // Stream<WebElement> 
					.filter(i->i.getText().trim().length()>0)
					.filter(i-> !i.getText().toLowerCase().contains("s"))
					.map(i-> i.getText().toUpperCase())
					.forEach(e->System.out.println(e));
		
	}
	
	
	@Test	
	public void openGoogleModified() {
		
		// Java 8 way, method references
		
		this.driver.get("https://google.com/");
		this.driver.findElements(By.tagName("a"))    									// List<WebElement>
				   .stream()						  							 	   // Stream<WebElement> 
				   .map(WebElement::getText)		  								  // Stream<String>
				   .map(String::trim)				 							     // Stream<String>	
				   .filter(i-> i.length()>0)										// Stream<String>	
				   .filter(i-> !i.toLowerCase().contains("s"))					   // Stream<String>	
				   .map(String::toUpperCase)									  // Stream<String>				
				   .forEach(System.out::println);			   			
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
}
