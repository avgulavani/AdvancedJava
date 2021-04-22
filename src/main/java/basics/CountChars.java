package basics;

import java.util.HashMap;
import java.util.Map;

public class CountChars {
	
	public static void main(String args[]) {
		
		String input="aaaassssddddffhhhhjjjrerewwerecsdffsdfcxddasfds";
		
		Map<Character, Integer> freqs = new HashMap<>();
		for (char c : input.toCharArray()) {
		    freqs.merge(c,                  // key = char
		                1,                  // value to merge
		                Integer::sum);      // counting
		}
		System.out.println("Frequencies:\n" + freqs);

		
		
		
	}

}
