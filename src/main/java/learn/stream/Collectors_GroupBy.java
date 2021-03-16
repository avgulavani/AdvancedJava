package learn.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectors_GroupBy {
	
	public static void main(String args[]) {
	
	List<String> ls=new ArrayList<>();

	ls.add("bat");
	ls.add("ball");
	ls.add("apple");
	ls.add("mango");
	ls.add("cat");
	ls.add("wall");
	ls.add("mango");

	System.out.println("Strings with group by:: " +
	
		ls.stream()
		  .collect(Collectors.groupingBy(s->s.length()))     // just run it what a beautiful feature, stream hai to life is know ??
				  
	);
	
	Map<Integer,List<String>> lenthmap=	ls.stream()
			  						  .collect(Collectors.groupingBy(s->s.length()));
	
	
	Map<Character,List<String>> charmap=	ls.stream()
			  								  .collect(Collectors.groupingBy(s -> s.charAt(0))); 
	
	System.out.println("String with all 4 char length:: " +lenthmap.get(4));
	System.out.println("String with all 4 char length:: " +lenthmap.get(8));
	System.out.println("String with all 4 char length:: " +lenthmap.get(3));
	
	
	System.out.println("String with group by char:: " +charmap);   // just check this cool one ..
	
}
	

}
