package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class PeekDemo {

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);

		/*
		 *    .peek is just for debugging purpose
		 */
		
		System.out.println("*** Stream starting ***");
		ls.stream()
		  .peek(i-> System.out.println("filter recevied:: " +i))
		  .filter(i->i%2 != 0)
		  .limit(3)
		  .peek(i-> System.out.println("map recevied:: " +i))
		  .map(i->i*i)
		  .forEach(System.out::println);
		System.out.println("*** Stream ending ***");
	}

}
