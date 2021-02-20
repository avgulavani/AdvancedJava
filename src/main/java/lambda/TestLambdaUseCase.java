package lambda;

/*
 *   use case- to have different implementation for a method from interface we have to create two classes with obj, right?
 *   how many line for same code? 
 * 
 * 
 */

public class TestLambdaUseCase {
	
	public static void main(String args[]) {
		
		GreetingService obj1=new GreetingService() {
			
			public String greet(String firstName) {
				return  firstName;
			
			}
		};
		
		System.out.println(obj1.greet("test3"));
		
		GreetingService obj2=new GreetingService() {
			
			public String greet(String firstName) {
				return  firstName;
			
			}
		};
		
		System.out.println(obj2.greet("test1"));
	}

}
