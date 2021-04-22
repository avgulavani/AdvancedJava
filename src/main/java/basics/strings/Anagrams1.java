package basics.strings;

import java.util.HashMap;
import java.util.Map;

public class Anagrams1 {

	public static void main(String[] args) {
		
		String a="aba";
		String b="ab";
		
		Map<Character, Integer> mapA=createmap(a);
		Map<Character, Integer> mapB=createmap(b);
		
		System.out.println(mapA + "    " + mapB);
		
		boolean result=isAnagram(mapA,mapB);
		System.out.println(result);

	}

	private static boolean isAnagram(Map<Character, Integer> mapA, Map<Character, Integer> mapB) {
		
			boolean result = false;
			for(Character key:mapA.keySet()) {
				if(mapB.containsKey(key)) {
					
					if (mapA.get(key).equals(mapB.get(key)))
						result=true;
					else
						return false;
				}
				
			}
				return result;
	}

				private static Map<Character, Integer> createmap(String a) {
					
					 Map<Character,Integer> map1=new HashMap<>();
					 int counter = 1;
					 
					for(int i=0;i<a.length();i++) {
						
						if(map1.keySet().contains(a.charAt(i))) {
							map1.put(a.charAt(i), map1.get(a.charAt(i))+1);
						}
						else if(!map1.keySet().contains(a.charAt(i))) {
							map1.put(a.charAt(i), counter);
							
						}
		}
		 
		
		return map1;
	}

}
