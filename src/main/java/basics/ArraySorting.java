package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySorting {

	
	public static void main(String args[]) {
		
		ArrayList<Integer> ls1=new ArrayList<Integer>(Arrays.asList(12,34));
		
		ArrayList<Integer> ls2=new ArrayList<Integer>(Arrays.asList(12,34,35));
		
		Collections.sort(ls1);
		Collections.sort(ls2);
		
		if(ls1.equals(ls2))
			System.out.println("TWO LIST ARE EQUAL");
		else
			System.out.println("TWO LIST ARE NOT EQUAL");
		
		// java 8 way
		
		List<Integer> filterList= ls1.stream()
									 .filter(e->ls2.equals(e)).collect(Collectors.toList());
		
		System.out.println(filterList);
		/*if(filterList.isEmpty())
			System.out.println("List is not same and unmatched elements are " +filterList);
		else
			System.out.println("TWO LIST ARE EQUAL"); */
			
			
		}
	
}
