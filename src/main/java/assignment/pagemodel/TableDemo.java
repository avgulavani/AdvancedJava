package assignment.pagemodel;

import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TableDemo {
	
	private final WebDriver driver;
	
	public TableDemo(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void openLink() {
		
		this.driver.get("https://vins-udemy.s3.amazonaws.com/java/html/java8-stream-table.html");
	}
	
	
	public void filterCheckboxPredicate(Predicate<List<WebElement>> gender) {
	this.driver.findElements(By.tagName("tr"))	
	.stream()
	.skip(1)
	.map(tr-> tr.findElements(By.tagName("td")))							// map applies function to stream element
	.filter(td-> td.size()==4)
	.filter(gender)															// predicate 
	.map(tdlist->tdlist.get(3))   											
	.map(td-> td.findElement(By.tagName("input")))
	.forEach(WebElement::click);
	}
	
	public void filterCheckbox (String gender) {
		this.driver.findElements(By.tagName("tr"))	
		.stream()
		.skip(1)
		.map(tr-> tr.findElements(By.tagName("td")))							// map applies function to stream element
		.filter(td-> td.size()==4)
		.filter(tdlist-> tdlist.get(1).getText().equalsIgnoreCase(gender))		// td containing checkbox
		.map(tdlist->tdlist.get(3))   											
		.map(td-> td.findElement(By.tagName("input")))
		.forEach(WebElement::click);
		}
}
