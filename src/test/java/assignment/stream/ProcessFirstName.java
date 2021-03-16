package assignment.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ProcessFirstName {

	public static void main(String[] args) throws IOException {

		/// Users/a.vitthal.gulavani/Desktop/Personal_Data/personal_workspace/learn.advance.java/src/main/java/resources/firstnames.txt

		String filepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main"
				+ File.separator + "java" + File.separator + "resources" + File.separator + "firstnames.txt";

		Path path = Paths.get(filepath);
		List<String> ls = Files.readAllLines(path);
		System.out.println(filepath);
		
		

		// Print count of names which start with B
		
		System.out.println("-------------------------------");
		long count = ls.stream().filter(a -> a.startsWith("B")).count();

		System.out.println("Count of names which start with B:: " + count);
		
		

		// create a list of names which start with c and contains 's' in it
		
		System.out.println("-------------------------------");
		List<String> result = ls.stream().filter(b -> b.startsWith("C")).filter(n -> n.contains("s"))
				.collect(Collectors.toList());

		System.out.println(
				"List of names which start with c and contains s and their size:: " + result.size() + "-" + result);

		
		
		// 3 print the total no of chars for all the names start with M (ex. Mary,Matthew=11)
		
		System.out.println("-------------------------------");
		System.out.println("Total number of chars for all the names start with M:: " + 
		
					       ls.stream()
		                     .filter(names -> names.startsWith("M"))
		                     .map(String::trim)
		                     .map(String::length)
		                     .mapToInt(a -> a).sum()

		);
		
		
		// Find the names containing - and replace it with a space	
		
		System.out.println("-------------------------------");
		System.out.println("Names containing - and replace it with a space" +
		
						ls.stream()
						.filter(names-> names.contains("-"))
						.map(names-> names.replaceAll("-", " "))
						.collect(Collectors.toList())
				);
		
		// find the the name which has more chars
		
		System.out.println("-------------------------------");
		System.out.println("Name which has more chars:: " +
				
						ls.stream()
						  .max(Comparator.comparing(s->s.length()))
						  .get()		
				);
		
		
		
	}

}
