package assignment.stream;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import assignment.pagemodel.PriceTable;
import functional.supplier.DriverFactory;
import junit.framework.Assert;

public class PriceTableTest {
	
		private WebDriver driver;
		
		@BeforeTest
		@Parameters("browser")
		public void setDriver(@Optional("chrome") String browser) {
			this.driver=DriverFactory.getDriver(browser);
		}
		
		@Test
		public void priceTableTest() {
			
			PriceTable priceTable=new PriceTable(this.driver);
			
			priceTable.openPage();
			priceTable.selectMinPrice();
			String status=priceTable.getStatus();
			
			Assert.assertEquals("PASS", status);
			
			Uninterruptibles.sleepUninterruptibly(4, TimeUnit.SECONDS);
		}
			
			
		
		@AfterTest
		public void quitDriver() {
			this.driver.quit();
		}
		

}
