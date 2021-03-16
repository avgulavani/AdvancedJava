package learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamReusableDemo {
	
	public static void main(String args[]) {
		
		List<String> ls=new ArrayList<>();
		
		ls.add("apple");
		ls.add("mumbai");
		ls.add("delhi");
		ls.add("muunar");
		ls.add("pune");
		
		
	Stream<String> stream =	ls.stream()
					  		.filter(s->s.length()>3);
					 
	stream.forEach(System.out::println);
	stream.forEach(s->s.toUpperCase());    	// no buddy, not second time...sorry !
	  
	
	}

}
