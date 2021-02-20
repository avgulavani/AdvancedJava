package lambda;

public class UnderstandHigherOrderFn {

	public static void main(String args[]) {

		/*
		 * In general we always pass data to function to change behavior Before Java 8 -
		 * We used to give data to function which work for us Higer Order Funcion - >
		 * function will give you data you decide how it will behave
		 * 
		 *  SUMMARY:
		 */

		String a = "test1";
		String a1 = "test2";
		String a2 = "test3";

		convertUpperCase(a);
		convertUpperCase(a1);
		convertUpperCase(a2);

		converLowerCase(a);
		converLowerCase(a1);
		
		test(n->n.toLowerCase());
		test(n->n.toUpperCase());

	}

	public static void convertUpperCase(String b) {
		System.out.println(b.toUpperCase());

	}

	public static void converLowerCase(String b) {
		System.out.println(b.toLowerCase());

	}

	// Java 8 Feature-
	// We are passing function/behavior as param to function


	public static void test(GreetingService g1){
		
		String returnedString=g1.greet("beaAtifuL java 8");
		System.out.println("from lambda: " +returnedString);
	}
}

