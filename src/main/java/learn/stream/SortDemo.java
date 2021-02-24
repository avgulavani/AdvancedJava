package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class SortDemo {

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList<>();
		ls.add(8);
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		

		System.out.println("*** Starting Stream ***");
		ls.stream()
		  .filter(i->{
			  System.out.println("filter recevied:: " +i);
			  return i%2 == 0;
		  })    
		  .sorted()
		  .limit(3)  // 8,2,4 
		    // 2,4,8 
		  .map(i->{
			  System.out.println("map-recevied:: " +i);
			  return i*i;
		  })
		  .forEach(System.out::println);
		System.out.println("*** Ending Stream ***");
	}

}
