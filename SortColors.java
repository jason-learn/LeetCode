package medium;

import java.util.Arrays;

//75. Sort Colors
public class SortColors {
	 public void sortColors(int[] A) {
	    if(A==null || A.length==0)  
	        return;  
	    int idx0 = 0;  
	    int idx1 = 0;  
	    for(int i=0;i<A.length;i++)  
	    {  
	        if(A[i]==0)  
	        {  
	            A[i] = 2;  
	            A[idx1++] = 1;  
	            A[idx0++] = 0;  
	        }  
	        else if(A[i]==1)  
	        {  
	            A[i] = 2;  
	            A[idx1++] = 1;  
	        }  
	    } 
	    System.out.println(Arrays.toString(A));
	   
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortColors sortColors = new SortColors();
		int[] A = {2,1,1,0};
		sortColors.sortColors(A);

	}

}
