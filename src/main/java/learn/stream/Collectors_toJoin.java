package learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors_toJoin {
	
	public static void main(String args[]) {
		
		List<String> ls=new ArrayList<>();

		ls.add("bat");
		ls.add("ball");
		ls.add("apple");
		ls.add("mango");
		ls.add("cat");
		ls.add("wall");
		ls.add("mango");
		

		System.out.println("New Set and join:: " +
		ls.stream()
		.filter(l-> l.length()>3)
		.collect(Collectors.joining("-"))
				);
	}

}