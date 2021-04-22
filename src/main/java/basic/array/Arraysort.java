package basic.array;

public class Arraysort {
	
	public static void main(String args[]) {
		
		int a[]= {3,2,1};
		int smallnumber=0;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]>a[j]) {
					
					int temp=a[i];  
					a[i]=a[j];      
					a[j]=temp;   
					
				}
			}
		}
		
		
		for (int i : a) {
			System.out.println(i);
		}
		
	}

}
