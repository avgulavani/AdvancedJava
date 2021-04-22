package basics;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapComparision {

	public static void main(String[] args) {
		
		Map<String,Integer> map1=new HashMap<String,Integer>();
		map1.put("Mumbbai",1);
		map1.put("Pune",2);
		map1.put("Delhi",3);
		
		Map<String,Integer> map2=new HashMap<String,Integer>();
		map1.put("Mumbbai",2);
		map1.put("Pune",2);
		map1.put("Kolkata",3);
		
			HashSet<String> map1exra=new HashSet<>(map2.keySet());
			map1exra.addAll(map1.keySet());
			map1exra.removeAll(map1.keySet());
			
			for(String key:map1exra)
			{
			
				System.out.println(map1.get(key));
				
			}
		

	}

}
