package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class FlatMapDemo {

	public static void main(String arg[]) {

		List<Integer> a = new ArrayList<>();

		a.add(1);
		a.add(2);
		a.add(3);

		List<Integer> b = new ArrayList<>();

		a.add(4);
		a.add(5);
		a.add(6);

		List<Integer> c = new ArrayList<>();

		a.add(7);
		a.add(8);
		a.add(9);
		
		List<List<Integer>> list=new ArrayList<>();
		list.add(a);
		list.add(b);
		list.add(c);
		
		list.stream()										// List<Stream<Integer>
			.flatMap(l->l.stream())							// Stream<Integer>
			.forEach(System.out::println);

	}

}
