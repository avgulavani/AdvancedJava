package assignment.stream;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functional.supplier.DriverFactory;
import util.LinkUtil;

public class BrokenTest {
	
	
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver=DriverFactory.getDriver(browser);
	}


	@Test	
	public void BrokenLinks() {
		
		this.driver.get("https://the-internet.herokuapp.com/broken_images");
		this.driver.findElements(By.xpath("//*[@src]"))
			.stream()
			.map(e-> e.getAttribute("src"))
			.forEach(r->{
				
				System.out.println(LinkUtil.getResponseCode(r)+ "::" +r);
				}	
					);
				
		
	}
	
	@Test	
	public void checkBrokenLinks() {
		
		this.driver.get("https://the-internet.herokuapp.com/broken_images");
		boolean result= this.driver.findElements(By.xpath("//*[@src]"))
			.stream()
			.map(e-> e.getAttribute("src"))
			.map(rc-> LinkUtil.getResponseCode(rc))
			.anyMatch(rc -> rc != 200);
				
		AssertJUnit.assertFalse(result);
	}
	
	@Test	
	public void collectBrokenLinks() {
		
		this.driver.get("https://the-internet.herokuapp.com/broken_images");
		List<String> ls= this.driver.findElements(By.xpath("//*[@src]"))
			.stream()
			.map(e-> e.getAttribute("src"))
			.filter(rc ->  LinkUtil.getResponseCode(rc)!=200)
			.collect(Collectors.toList());
		
				
		Assert.assertEquals(ls.size(),0,ls.toString());
	}
	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}

}
