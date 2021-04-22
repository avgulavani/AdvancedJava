package basics.strings;

public class CountCharString {

	public static void main(String[] args) {
		
		
		String s="Hello World";
		
		System.out.println(calculateCount(s,'l'));
		
	}

	public static int calculateCount(String s,char string) {
		int count=0;
		
		for(int i=0;i<s.length();i++) {
			
			
			if(s.charAt(i)==string) {
				
				count++;
			}
	}
		return count;
 }
}
