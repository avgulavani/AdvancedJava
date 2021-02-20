package lambda;

public class TestCalculator {
	
	public static void main(String args[])
	{
		
		// This is behavior
		MathOperation add=(a,b)->a+b;
		MathOperation subtract=(a,b)->a-b;
		MathOperation multiply=(a,b)->a*b;
		MathOperation divide=(a,b)->a/b;
		
		int onScreenNumber=0;
		
		// providing behavior on the fly (add,sub etc)
		onScreenNumber=Calculate(5,add,2);
		onScreenNumber=Calculate(onScreenNumber,subtract,3);
		onScreenNumber=Calculate(onScreenNumber,multiply,7);
		onScreenNumber=Calculate(onScreenNumber,add,2);
		onScreenNumber=Calculate(onScreenNumber,divide,3);
		
		//Test this, passing behavior to method
		System.out.println("OnScreenNumber number is:: " +onScreenNumber);
		
		
	}
	

		// This guy has the data
	private static int Calculate(int onScreenNumber,MathOperation mathOperation,int enteredNumber)
	{

		return mathOperation.operate(onScreenNumber,enteredNumber);
		
	}

}
