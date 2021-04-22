package comparision;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashmapComapre {
	
	public static void main(String args[]) {
		
		Map<String,Integer> map1=new HashMap<>();
		map1.put("India", 1);
		map1.put("Germany", 2);
		map1.put("Brazil", 3);
		
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("India", 1);
		map2.put("Germany", 2);
		map2.put("Brazil", 3);
		
		//entry comparison
		 System.out.println(map1.equals(map2) ? "same": "not same");
		 
		 // key set comparison
		 
		 System.out.println(map1.keySet().equals(map2.keySet()) ? "same": "not same");
		 
		 HashSet<Integer> hs1=new HashSet<>(map1.values());
		 
		 HashSet<Integer> hs2=new HashSet<>(map2.values());
		 
		 System.out.println(hs1.equals(hs2) ? "same": "not same");
		 
	}

}
