package basics.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MergeMap {

	public static void main(String[] args) {
		
		
		Map<String,Integer> map1=new HashMap<>();
		Map<String,Integer> map2=new HashMap<>();
		
		map1.put("A", 1);
		map1.put("B", 2);
		

		map1.put("A", 2);
		map1.put("D", 2);
	
		
		map1.putAll(map2);
		
		map2.putAll(map1);
		
		System.out.println(map2);
		
		// find common 
		
		Set<String> commonkey=new HashSet<>(map1.keySet());
		Set<String> map1missing=new HashSet<>(map1.keySet());

		for (String string : map1missing) {
			System.out.println(string);
		}
		
		
		Set<String> map2missing=new HashSet<>(map1.keySet());
		
		map1missing.addAll(map2.keySet());

		for (String string : map1missing) {
			System.out.println(string);
		}
		
		
		map1missing.removeAll(map1.keySet());
		
		for (String string : map1missing) {
			System.out.println(string);
		}
		
		
		
	
	}

}
