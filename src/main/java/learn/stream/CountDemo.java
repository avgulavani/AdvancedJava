package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class CountDemo {
	
	public static void main(String args[]) {
	
			List<String> ls=new ArrayList<>();
			
			ls.add("apple");
			ls.add("ball");
			ls.add("cat");
			ls.add("dog");
			ls.add("ac");
			ls.add("ad");
			ls.add("fridge");
			ls.add("building");
			ls.add("sofa");
			ls.add("chair");
			ls.add("door");
			
			ls.stream()
			.filter(s-> s.length()<3)
			.forEach(System.out::println);
			
		
	}

}
