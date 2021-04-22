package lambda;

public class WhenLambdaExecuted {

	public static void main(String args[]) {

		System.out.println("starting execution");

		// receviedNumber(getNumber());

		/*
		 * so here lamda is just declaration at first/providing behavior/not executed at
		 * first passing behavior to test method g is behvaior g.greet() --> its start
		 * executing behavor/code so call is under test method
		 * 
		 */

		test(n -> {
			System.out.println("inside lambda");
			return n.toUpperCase();
		});

		System.out.println("ending execution");

	}

	public static int getNumber() {
		System.out.println("called getnumber ");
		return 5;
	}

	public static void receviedNumber(int i) {
		System.out.println("number is :: " + i);

	}

	public static void test(GreetingService g1) {

		System.out.println("inside test/ Service-Greetservice");

		String returnedString = g1.greet("beaatifuL java 8");
		System.out.println("from lambda: " + returnedString);
	}
}
