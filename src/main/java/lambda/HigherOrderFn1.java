package lambda;

public class HigherOrderFn1 {
	
	public static void main(String g[]) {
		
		/*	First Class object
		 * 	ability to assign a function to variable ( d is reference)
		 * 	So here you are passing function as parameter to test
		 */
			
		
		test(a->a.replace("e", "E"));
		test(a->a.toUpperCase());
		
	}
	
	public static void test(GreetingService g) {
		String returnedString=g.greet("Test");
		System.out.println(returnedString);
	}

}
