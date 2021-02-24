package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class MoreFilter_Map {

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

		/*    1. check for even no
		 *    2. ensure no is >5
		 *    3. find the square and add 2
		 *    4. print no on console one by one
		 */
		
		System.out.println("*** Stream starting ***");
		ls.stream()
	  //  .skip(4)  
		  .peek(i-> System.out.println("filter recevied:: " +i))
		  .filter(i-> i%2 == 0)
		  .filter(i-> i>5)
		  .limit(3)
		  .peek(i-> System.out.println("map recevied:: " +i))
		  .map(i-> i*i)     
		  .map(i-> i+2)
		  .forEach(System.out::println);
		System.out.println("*** Stream ending ***");
	}


}
