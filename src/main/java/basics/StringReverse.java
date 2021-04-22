package basics;

public class StringReverse {

	public static void main(String[] args) {
		
		boolean java8= false;
		
		// reverse
		
		String reverseInput="ashish";
		String reverseString="";
		
		if (!java8){
			for(int i=reverseInput.length()-1;i>=0;i--) {
			
				reverseString=reverseString+reverseInput.charAt(i);	
			}
		}
		
	}
		
		// palindrom 
		
	 boolean checkResult(String input)
		{
		String palindromInput="aaa";
		int palindromlength=palindromInput.length();
		boolean result=true;
		
		for(int t=0;t<palindromlength/2;t++) {
			
			if(palindromInput.charAt(t)!=palindromInput.charAt(palindromlength-1))
			{
				result= false;
				break;
			}
			
		//	  return result ;
			
			}
		return result;
	
	}

}
