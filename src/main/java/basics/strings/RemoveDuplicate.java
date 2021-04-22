package basics.strings;

import java.util.Arrays;

public class RemoveDuplicate {
	
	
	static String removeDuplicate(char str[], int n)
    {
       
        int index = 0;

        for (int i = 0; i < n; i++)
        {
  
          
            int j;
            for (j = 0; j < i; j++) 
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
  
   
            if (j == i) 
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
	
	// Driver code
    public static void main(String[] args)
    {
        char str[] = "ashish".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }

}
