package lambda;

/*
 *   use case- to have different implementation for a method from interface we have to create two classes with obj, right?
 *   how many line for same code? 
 * 
 * 
 */

public class TestLambdaSolution {

	public static void main(String args[]) {

		// implemeting greeteservice interface old way

		GreetingService obj1 = new GreetingService() {

			public String greet(String firstName) {
				return firstName;

			}
		};

		/*
		 * lambda expression is implementation of interface ONLY condition is-
		 * interface should have ONLY ONE abstract method
		 */
		
		GreetingService obj2 = (firstName) -> 
		{
			System.out.println("Hi :: " + firstName.toUpperCase());
			System.out.println("length of string is :: " + firstName.length());
			return firstName;
		};
		
			obj2.greet("test1");

	};
}
