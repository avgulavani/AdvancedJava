package assignment.pagemodel;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import functional.supplier.DriverFactory;

public class HOverableDropDownTest {
	
	private WebDriver driver;
	private Actions action;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver=DriverFactory.getDriver(browser);
		this.action=new Actions(driver);
	}
	
	
	@Test(dataProvider ="linkProvider")
	public void dropDownTest(String path) {
		
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/drop-down.html");
		
		String split[]=path.split("=>");
		
		Arrays.stream(split)
			  .map(s->   s.trim())
			  .map(s->   By.linkText(s))
			  .map(by->  driver.findElement(by))
			  .map(ele-> action.moveToElement(ele));
			 	
		Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
	}
		
	

	@DataProvider(name = "linkProvider")
	public Object[] testData() {

		return new Object[] {

				"Dropdown => DropDown Link 2",
				"Dropdown => DropDown Link 5 => Dropdown => Submenu Link 5.1",	
				"Dropdown => DropDown Link 5 => Dropdown => Submenu Link 5.4 => Submenu Link 5.4.2",
		};
	}
		
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
	

}
