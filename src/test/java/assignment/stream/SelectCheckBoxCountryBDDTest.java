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
import factory.classes.SearchCriteria_Predicate;
import functional.supplier.DriverFactory;

public class SelectCheckBoxCountryBDDTest {

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

		return new Object[] {

				SearchCriteria_Predicate.getCriteria("allmale"),
				SearchCriteria_Predicate.getCriteria("allfemale"),
				SearchCriteria_Predicate.getCriteria("allgender"),
				SearchCriteria_Predicate.getCriteria("allAU"),
				SearchCriteria_Predicate.getCriteria("allFemaleAU")
		};
	}

	@AfterTest
	public void closeBrowser() {
		this.driver.quit();
	}
}
