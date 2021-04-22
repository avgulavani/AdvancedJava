package basics.strings;

public class StringMuttableConcept {
	
	
	public static void main(String ars[]) {
		
		String a="hello";
		String b="hello";
		
		a.concat("test");
		
		System.out.println(a);
		
		StringBuilder s=new StringBuilder("hello");
		s.append("test");
		
		System.out.println(s);
		System.out.println(s.insert(4, "A"));
		
		
		//StringBuilde
	}

}
