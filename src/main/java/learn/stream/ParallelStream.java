package learn.stream;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import functional.supplier.DriverFactory;
import util.LinkUtil;

public class ParallelStream {
	
	private WebDriver driver;
	
	@BeforeTest
	@Parameters("browser")
	public void setDriver(@Optional("chrome") String browser) {
		this.driver=DriverFactory.getDriver(browser);
	}


	@Test	
	public void calculateTime() {
		
		this.driver.get("https://www.google.com");
		
		System.out.println("Before test start time normal :: " +LocalDateTime.now());
		
		List<String> ls= this.driver.findElements(By.xpath("//*[@src]"))
			.stream()
			.map(e-> e.getAttribute("src"))
			.filter(rc ->  LinkUtil.getResponseCode(rc)!=200)
			.collect(Collectors.toList());
		
		System.out.println("After test start time normal :: " +LocalDateTime.now());
		
	}
	
	@Test	
	public void imporvePerforamnce() {
		
		this.driver.get("https://www.google.com");
		
		System.out.println("Before test start time perorrmance fix :: " +LocalDateTime.now());
		
		List<String> ls= this.driver.findElements(By.xpath("//*[@src]"))
			.stream()
			.parallel()
			.map(e-> e.getAttribute("src"))
			.filter(rc ->  LinkUtil.getResponseCode(rc)!=200)
			.collect(Collectors.toList());
		
		System.out.println("After test start time perorrmance fix :: " +LocalDateTime.now());
		
	}
	

	
	@AfterTest
	public void quitDriver() {
		this.driver.quit();
	}
}
