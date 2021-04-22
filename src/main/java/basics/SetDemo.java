package basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	
	public static void main(String aregs[]) {
		
		Set<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("Germany");
		hs.add("Brazil");
		hs.add("Brazil");
		
		System.out.println(hs);
		
		Set<Integer> hn=new HashSet<Integer>();
		
		hn.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6));
		
		Iterator<Integer> it=hn.iterator() ;
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
				
	}
	
}
