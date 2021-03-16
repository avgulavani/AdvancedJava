package factory.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

import org.openqa.selenium.WebElement;

public class SearchCriteria_Predicate {
	
	private static Predicate<List<WebElement>> allmale=	     (l)->l.get(1).getText().equalsIgnoreCase("male");
	private static Predicate<List<WebElement>> allfemale=	 (l)->l.get(1).getText().equalsIgnoreCase("female");
	private static Predicate<List<WebElement>> allgender=	  allmale.or(allfemale);
	private static Predicate<List<WebElement>> allAU= 		 (l)->l.get(2).getText().equalsIgnoreCase("AU");
	private static Predicate<List<WebElement>> allFemaleAU=  allfemale.and(allAU);

	
	private static final Map<String,Predicate<List<WebElement>>> MAP= new HashMap<>();
	
	static {
		
		MAP.put("allmale", allmale);
		MAP.put("allfemale", allfemale);
		MAP.put("allgender", allgender);
		MAP.put("allAU", allAU);
		MAP.put("allFemaleAU", allFemaleAU);
	}
	
	public static Predicate<List<WebElement>> getCriteria(String criteriaName){
		
		return MAP.get(criteriaName);
	}
}
