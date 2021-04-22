package basics.strings;

import java.util.ArrayList;
import java.util.Arrays;

public class StringToken {

	public static void main(String[] args) {
		
		
			String s=" ";
			
			
			    String[]a = s.trim().split("[^\s!,?._'@]+");
	            ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
	            System.out.println(listOfStrings.size());
	      
	          for(String str:listOfStrings){
	            System.out.println(str);
	          }    
	}

}
