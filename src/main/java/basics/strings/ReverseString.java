package basics.strings;

public class ReverseString {
	
	
	
	public  static void main(String args[]) {
		
		
		
		int i=137;
		int reverNo=0;
		
		while(i>0) {
			
			int digit=i%10;
			
			reverNo=digit+reverNo*10;
			
			i=i/10;
			
		}
		System.out.println(reverNo);
	}
	

}
