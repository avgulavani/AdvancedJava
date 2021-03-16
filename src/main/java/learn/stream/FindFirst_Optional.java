package learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirst_Optional {

	public static void main(String args[]) {

		List<String> ls = new ArrayList<>();

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
		
		// Try to run with length >>3 and > 30 to understand optional.empty

		System.out.print(ls.stream().filter(s -> s.length() > 3).findFirst());
		
		Optional<String> op= ls.stream()
							 .filter(s -> s.length() > 10)
							  .findFirst();
		
		if(op.isPresent()) {
			
			System.out.println(op.get());
		}

	}

}
