package basics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CompareListDemo{
	
	public static void main(String args[]) {
		
		List<String> a1= Arrays.asList("Germany","India","Brazil");
		List<String> b1= Arrays.asList("India","Germany"); 
		
		List<String> differences=  a1.stream()
									  .filter(e->!b1.contains(e))
									  .collect(Collectors.toList());
		
		System.out.println(differences);
		
	}
}