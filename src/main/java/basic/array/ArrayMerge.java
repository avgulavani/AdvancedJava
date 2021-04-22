package basic.array;

public class ArrayMerge {
	
	public static void main(String args[]) {
	
	int firstArray[]= {1,2,3,4,5,6,7,8,9,0};	
	int secondArray[]= {1,2,3,4,5,6,7,8,9,0};
	
	int firstArraylength=firstArray.length;
	int secondArraylength=secondArray.length;
	
	int c[]= new int [firstArraylength+secondArraylength];
	
		for(int i=0;i<firstArraylength;i++) {
			
			c[i]=firstArray[i];
		}
		
		for(int i=0;i<secondArraylength;i++) {
			
			c[i+firstArraylength]=secondArray[i];
		}
		
		for (int i : c) {
			System.out.println(i);
		}

	}
	
	

}
