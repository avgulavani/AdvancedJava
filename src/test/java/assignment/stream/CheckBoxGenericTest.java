package assignment.stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Uninterruptibles;

import assignment.pagemodel.TableDemo;
import functional.supplier.DriverFactory;

public class CheckBoxGenericTest {

	// Select all checkbox
	// Select checkbox based on gender

	private WebDriver driver;
	private TableDemo tableDemo;

	@BeforeTest
	@Parameters("browser")
	public void getDriver(@Optional("chrome") String browser) {
		this.driver = DriverFactory.getDriver(browser);
		this.tableDemo = new TableDemo(driver);
	}


	@Test(dataProvider = "criteriaProvider")
	public void Filterchecbox(Predicate<List<WebElement>> searchCriteria) {

		tableDemo.openLink();
		tableDemo.filterCheckboxPredicate(searchCriteria);
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
	}

	
	@DataProvider(name = "criteriaProvider")
	public Object[] testData() {
		
		/*
		 *  here we are using lambda function and with help of predicate we are passing all fe/male locators
		 *  everything is controlled by test data provider mail,feamale and all gender
		 */
		
		Predicate<List<WebElement>> allmale=(l)->l.get(1).getText().equalsIgnoreCase("male");
		Predicate<List<WebElement>> allfemale=(l)->l.get(1).getText().equalsIgnoreCase("female");
		Predicate<List<WebElement>> allgender=allmale.or(allfemale);

		return new Object[] {
				allmale, allfemale,allgender };
	}	

	@AfterTest
	public void closeBrowser() {
		this.driver.quit();
	}
}
