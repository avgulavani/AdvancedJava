package assignment.stream;

import java.util.concurrent.TimeUnit;

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

import assignment.pagemodel.CheckBoxTable;
import functional.supplier.DriverFactory;

public class SelectCheckBoxGenderTest {

	// Select all checkbox
	// Select checkbox based on gender

	private WebDriver driver;
	private CheckBoxTable tableDemo;

	@BeforeTest
	@Parameters("browser")
	public void getDriver(@Optional("chrome") String browser) {
		this.driver = DriverFactory.getDriver(browser);
		this.tableDemo = new CheckBoxTable(driver);
	}

	@Test
	public void Selectcheckbox() {
		tableDemo.openLink();
		this.driver.findElements(By.tagName("input")).stream().forEach(WebElement::click);
	}

	@Test(dataProvider = "gender")
	public void Filterchecbox(String gender) {

		tableDemo.openLink();
		tableDemo.filterCheckbox(gender);
		Uninterruptibles.sleepUninterruptibly(2, TimeUnit.SECONDS);
	}

	@DataProvider(name = "gender")
	public Object[] testData() {

		return new Object[] { "male", "female" };
	}

	@AfterTest
	public void closeBrowser() {
		this.driver.quit();
	}
}
