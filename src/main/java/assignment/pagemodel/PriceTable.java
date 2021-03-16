package assignment.pagemodel;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PriceTable {

	private WebDriver driver;

	@FindBy(css = "table#prods tr")
	private List<WebElement> price;

	@FindBy(id = "result")
	private WebElement verifybutton;

	@FindBy(id = "status")
	private WebElement status;
	
	public PriceTable(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	public void openPage	() {

		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table-price.html");
	}

	public void selectMinPrice() {

		Optional<List<WebElement>> minrow = price.stream()
												  .skip(1)
												  .map(tr -> tr.findElements(By.tagName("td")))
												  .min(Comparator.comparing(tdList -> Integer.parseInt(tdList.get(2)
											      .getText())));
		
		if (minrow.isPresent()) {
			
			System.out.println("min row" +minrow);

			List<WebElement> cells = minrow.get();
			System.out.println("ALL CELLS" +cells);
			cells.get(3).findElement(By.tagName("input")).click();
		}

		this.verifybutton.click();

	}

	public String getStatus() {

		return this.status.getText().trim();
	}

}
