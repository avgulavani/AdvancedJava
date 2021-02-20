package lambda;

public class HigherOrderFn2 {

	public static void main(String g[]) {

		/*
		 * First Class object ability to assign a function to variable ( d is reference)
		 * So here you are passing function as parameter to test
		 */

		String ss = getLambda().greet("hello");
		System.out.println(ss);
	}

	public static GreetingService getLambda() {
		return (s) -> s.toUpperCase();
	}
}
