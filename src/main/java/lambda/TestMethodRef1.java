package lambda;

public class TestMethodRef1 {
	
	public static void main(String args[]) {
		
		StringOperations op1= (s)->System.out.println("Recevied String is :: " +s);
		
		// whatever i (lambda func) am getting i am just passing to static method. no processing/nothing so we can use in a such way.
		
		StringOperations op2=System.out::println;
		
		// if i am getting string i am going to call directly method.
		
		StringOperations op3=String::toUpperCase;
		
		op1.accept("test");
		op2.accept("wonder");
		op3.accept("magic");
	}
	
	

}
