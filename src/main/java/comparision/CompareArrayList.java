package comparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrayList {
	
	public static void main(String args[]) {
		
		List<Integer> ls1=Arrays.asList(122,100,90);
		List<Integer> ls2=Arrays.asList(123,10,80);
		
		List<Integer> ls3=new ArrayList<Integer>();
		List<Integer> ls4=new ArrayList<Integer>();
		
		ls3.add(1);
		ls3.add(2);
		ls3.add(3);
		
		ls4.add(4);
		ls4.add(5);
		ls4.add(6);
	
		System.out.println(ls1.equals(ls2)? "same":"not same");
		
		
		
		ls3.addAll(ls4);
	
		System.out.println(ls3);
		
		
	}

}
