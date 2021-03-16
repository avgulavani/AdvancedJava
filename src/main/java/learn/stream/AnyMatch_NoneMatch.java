package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class AnyMatch_NoneMatch {
	
	public static void main(String args[]) {
		
		List<String> ls= new ArrayList<>();
		
		ls.add("apple");
		ls.add("cat");
		ls.add("dog");
		ls.add("bat");
		ls.add("ball");
		
		System.out.println(
							
				ls.stream()
				.filter(s-> s.length()>3)		  //  any match
				.anyMatch(s->s.contains("z"))     // return boolean true/false
				
				);
		
		
		System.out.println(
				
				ls.stream()
				.filter(s-> s.length()>3)
				.noneMatch(s->s.contains("z"))     // noneMatch 
				
				);
		
	}

}
