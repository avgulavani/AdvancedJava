package learn.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamDemo {
	
	public static void main(String args[]) {
		
		List<Integer> ls=new ArrayList<>();
		Collections.addAll(ls, 1,2,3,4,5,6,7,8,9);
	
		int total=	ls.stream()
					  .mapToInt(a->a)                   //-> converting reference type to primitive type
					  .sum();
		
		System.out.println("total is ::" +total);
		
		IntStream.range(1, 4)
				 .forEach(i -> System.out.println("Hello:: " +i));
		
		System.out.println("------ Range close demo ------ ");
		IntStream.rangeClosed(1, 4)
		 .forEach(i -> System.out.println("Hello:: " +i));
		
		
		
		
	}

}
