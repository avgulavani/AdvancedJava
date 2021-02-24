package learn.stream;

import java.util.ArrayList;
import java.util.List;

public class TraditionalWay {

	public static void main(String args[]) {

		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(7);
		ls.add(8);

		for (int a : ls) {
			if(a%2!=0)
			System.out.println("original no is: " +a+ " square is: "+(a*a));
		
		}
	}

}
