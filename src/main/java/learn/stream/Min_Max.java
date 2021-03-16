package learn.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Min_Max {

	public static void main(String args[]) {
		
		List<String> ls=new ArrayList<>();
		
		ls.add("apple");
		ls.add("bdd");
		ls.add("dog");
		ls.add("cata");
		
		System.out.println(
				
		ls.stream()
		  .min(Comparator.naturalOrder())
		  .get()  								// to retrieve actual value use get method for optional
		);
		
		System.out.println(
				
				ls.stream()
				  .min(Comparator.reverseOrder())
				  .get()  								
				);
		
		System.out.println(
				
				ls.stream()
				  .max(Comparator.naturalOrder())
				  .get()  								
				);
		System.out.println(
				
				ls.stream()
				  .max(Comparator.reverseOrder())
				  .get()  								
				);
	}
}
