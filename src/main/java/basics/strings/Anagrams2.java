package basics.strings;

import java.util.Arrays;

public class Anagrams2 {

	public static void main(String[] args) {
	    
       // Scanner scan = new Scanner(System.in);
       //s String a = scan.next();
        //String b = scan.next();
       // scan.close();
		
		String a="asd";
		String b="sad";
		
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

	private static boolean isAnagram(String a, String b) {
		
		char [] char1=a.toCharArray();
		char [] char2=b.toCharArray();
		
		Arrays.sort(char1);
		Arrays.sort(char2);
		
		if(!(char1.length==char2.length))
			return false;
		else
		{
			
			for(int i=0;i<char1.length;i++)
		{
				if(char1[i]!=char2[i])
					return false;
		}
		return true;
	}
		}
}
