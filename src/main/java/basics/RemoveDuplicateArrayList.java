package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {
	
	public static void main(String args[]) {
		
		ArrayList<Integer> no= new ArrayList<Integer> (Arrays.asList(1,2,3,3,4,4,5,6,7,7,8,9,1,2,3,3,4,5,5,6));
		
		System.out.println(no);
		LinkedHashSet<Integer> uniqueNo=new LinkedHashSet<Integer>(no);
		System.out.println(uniqueNo);
		
		
		// Java 8 
		
		List<Integer> ls=	no.stream()
							  .distinct()
							  .collect(Collectors.toList());
		
		System.out.println("java 8 way " + ls);
	}

}
