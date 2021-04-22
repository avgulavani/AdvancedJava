package basics.strings;

import java.util.Scanner;

class A{

public static void main(String[] args) {
		        
				 Scanner sc=new Scanner(System.in);
			     String A=sc.next();
			     String B=sc.next();
			     System.out.println(A.length()+B.length());
			     int no=A.compareTo(B);
			      if(no<0){
			         System.out.println("No");
			     }else if(no==0)
			    	 System.out.println("No");
			     else System.out.println("Yes");
			     String Aconverted=A.toUpperCase().charAt(0)+A.substring(1,A.length());
			     String Bconverted=B.toUpperCase().charAt(0)+B.substring(1,B.length());
			     System.out.println(Aconverted +" " + Bconverted);
     /* Enter your code here. Print output to STDOUT. */
			     
			     A.equals(B);
     
 }
}
	