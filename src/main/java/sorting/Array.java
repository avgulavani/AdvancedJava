package sorting;

public class Array {
	
	public static void main(String args[]) {
		
		
		int a[]= {12,34,13,11,10,5,54};
		
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
