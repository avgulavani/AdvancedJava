package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class BasicStream {

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

	
		ls.stream()
		  .filter(i->i%2 != 0)
		  .limit(3)
		  .map(i->i*i)
		  .forEach(System.out::println);
	}

}
