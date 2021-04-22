package basics.strings;


public class Lexicographical {

	 public static String getSmallestAndLargest(String s, int k) {
	        
		 	
	        String smallest = "";
	        String largest="";
	        String sub="";
	        
	        for(int i=0;i<=s.length()-k;i++) {
	        	
	        	sub=s.substring(i,i+k);
	        	if(smallest.isEmpty())
	        	{
	        		smallest=sub;
	        		largest=sub;
	        		continue;
	        	}
	        	if(sub.compareTo(smallest)<0)
	        		smallest=sub;
	        	else if (sub.compareTo(largest)>0)
	        		largest=sub;
	        }
	       
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	      
	    	String s="welcometojava";
	    	int k=3;
	        System.out.println(getSmallestAndLargest(s, k));
	    }
	}

