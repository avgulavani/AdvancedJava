package assignment.stream;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.google.common.util.concurrent.Uninterruptibles;
import assignment.pagemodel.CheckBoxTable;
import functional.supplier.DriverFactory;

public class SelectCheckBoxCountryTest {

	// Select all checkbox
	// Select checkbox based on country

	private WebDriver driver;
	private CheckBoxTable tableDemo;

	@BeforeTest
	@Parameters("browser")
	public void getDriver(@Optional("chrome") String browser) {
		this.driver = DriverFactory.getDriver(browser);
		this.tableDemo = new CheckBoxTable(driver);
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
		
		// If you give me alist i will checking country name from second index.
		Predicate<List<WebElement>> allAU= (l)->l.get(2).getText().equalsIgnoreCase("AU");
		
		// beauty of lambda, easy life......
		// all feamle in AU country
		Predicate<List<WebElement>> allFemaleAU= allfemale.and(allAU);
		

		return new Object[] {
				
				allmale,
				allfemale,
				allgender,
				allAU,
				allFemaleAU 
				
		};
	}	

	@AfterTest
	public void closeBrowser() {
		this.driver.quit();
	}
}
