package supplier.interfaces;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functional.supplier.DriverFactory;

public class DriverTest {
	
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver=DriverFactory.getDriver(browser);
	}


	@Test	
	public void openPage() {
		
		this.driver.get("https://www.udemy.com/");
		this.driver.findElements(By.tagName("a"))
					.forEach(e->System.out.println(e.getText()));
		
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
}
