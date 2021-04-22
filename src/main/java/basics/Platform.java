package basics;

import java.util.Arrays;
import java.util.List;

public class Platform {

	
	//Platform problem
	
	//arrival and departure one-to-one mapping

	public static void main(String args[]) {

		List<Integer> arrival = Arrays.asList(8, 11,12);
		List<Integer> departure = Arrays.asList(11,12,15);
		int platform = 0;

		for (Integer arr : arrival) {
			for (Integer depart : departure) {

				if(platform==0) {
					platform++;
					break;
				}
				if (arr > depart){
					continue;
					
				} else {
					platform++;
					break;

				}
			}
		}
		System.out.println(platform);

	}
}
