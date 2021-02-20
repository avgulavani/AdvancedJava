package lambda;

import java.util.ArrayList;
import java.util.List;

public class TestMethodRef2 {
	
	private static final  List<String> ls=new ArrayList<>();
	
	public static void main(String args[]) {
	
		StringOperations op1= ls::add;
		op1.accept("India");
		System.out.println(ls);
	}
	
	

}
