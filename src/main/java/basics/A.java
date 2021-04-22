package basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class A{

	
	public static void main(String args[]) {
		
		Map<String,Integer> map1=new  HashMap<String,Integer>();
		map1.put("India", 1);
		map1.put("Germany", 1);
		map1.put("Nepal", 2);
	
		
		Map<String,Integer> map2=new  HashMap<String,Integer>();
		map2.put("France", 1);
		map2.put("Germany", 1);
	
		
		Set<String> common=new HashSet<>(map1.keySet());
		common.retainAll(map2.keySet());
	
		
		if(common.isEmpty())
			System.out.println("No common key" );
		else
			System.out.println("common key" +common);
	}
	
}