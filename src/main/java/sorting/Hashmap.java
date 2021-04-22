package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
	
		
		Map<String,Integer> map1=new HashMap<>();
		map1.put("A", 3);
		map1.put("B", 2);
		map1.put("C", 1);
		
		
		// method 1 tree map
		sortmeusingTreemap(map1);
		System.out.println("using treemap " + map1);

		// method 2 arrayList
		
		sortmeusingArrayList(map1);
		System.out.println("using arraylist " + map1);
		

	}

	private static void sortmeusingTreemap(Map<String, Integer> map1) {
		
		TreeMap<String,Integer> tm=new TreeMap<>();
		
		tm.putAll(map1);
	
		
	}
	
	private static void sortmeusingArrayList(Map<String, Integer> map1) {
		
		ArrayList<String> ls=new ArrayList<>(map1.keySet());
		
		Collections.sort(ls);
		
	}

}
