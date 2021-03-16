package learn.stream;

import java.util.Optional;

public class OptionalDemo {
	
	 public static void main(String args[]) {
		 
		String a= "India";
		String b= "Germany";
		String c= "Greece";
		
		/*
		 *  Understand problem 
		 *  here functionality is , we are returning string. It might happen that returning string is null.
		 *  So there are chances of NPE. 
		 */
		
	//	System.out.println(getSmallest(a,b,c).toUpperCase()); 	-> Uncomment this line run and see NPE
	
	//	System.out.println(getMax(a,b,c).toUpperCase());     	-> error line can't do that as its optional check if string present first.
		
		Optional<String> maxValue=getMax(a,b,c);
		
		if(maxValue.isPresent())
			System.out.println("value is ::" + maxValue.get());
		else
			System.out.println(" no value found ");
		
	}
	 
	 private static String getSmallest(String var,String var2,String var3) {	 
		 return null;
		 
	 }
	 
	 // Optional of string, webdriver anything.
	 // Because of optional now you * enforcing * writer to check if string is present or not
	 
	 private static Optional<String> getMax(String var,String var2,String var3) {	
		 
		 return Optional.ofNullable(null);
		 
	 }
	 
	 

}
