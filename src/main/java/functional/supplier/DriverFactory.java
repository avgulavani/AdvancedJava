package functional.supplier;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	/*
	 * Understand Supplier interface
	 */

	private static final Supplier<WebDriver> chromeSupplier = () -> {

		System.setProperty("webdriver.chrome.driver",
				"/Users/a.vitthal.gulavani/Desktop/Personal_Data/protractor_js_framework.javascript/node_modules/protractor/node_modules/webdriver-manager/selenium/chromedriver_88.0.4324.96");
		return new ChromeDriver();

	};

	private static final Supplier<WebDriver> firefoxSupplier = () -> {

		//System.setProperty("webdriver.gecko.driver",
		//		"/Users/a.vitthal.gulavani/Desktop/Personal_Data/protractor_js_framework.javascript/node_modules/protractor/node_modules/webdriver-manager/selenium/geckodriver-v0.29.0");
		
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/a.vitthal.gulavani/Desktop/Personal_Data/protractor_js_framework.javascript/node_modules/protractor/node_modules/webdriver-manager/selenium/geckodriver-v0.29.0");
		return new ChromeDriver();

	};
	
	private static final Map<String,Supplier<WebDriver>> MAP=new HashMap();
	
	/*
	 *  everything in this class is static and final as we are not going to change this class frequently
	 *  also everything will be instantiated when class is loaded. 
	 *  nothing is exposed to public , added advantage
	 */
	static {
		
		MAP.put("chrome",chromeSupplier);
		MAP.put("firefox",firefoxSupplier);
	}

	// from test class just call this method
	// browser name is passed as key and in return lambda expression 
	// using SUpplier's get method lambbda expression is invoked.
	
	public static WebDriver getDriver(String browser) {
		return MAP.get(browser).get();		
		
	}
	
}
