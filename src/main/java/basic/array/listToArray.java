package basic.array;

import java.util.ArrayList;
import java.util.List;

public class listToArray {
	
	public static void main(String args[]) {
		
		List<String> ls=new ArrayList<>();
		ls.add("A");
		ls.add("B");
		ls.add("C");
		
		
		int size=ls.size();
		
		String[] s =new String[size];
		
		for(int i=0;i<size;i++) {
			
			s[i]=ls.get(i);
			
		}
		

		for(int i=0;i<s.length;i++) {
			
			System.out.println(s[i]);
			
		}
		
		String a []=ls.stream().toArray(String[]::new);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
			
		}
	}

}
