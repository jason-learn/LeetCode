package easy;

//136. Single Number
public class SingleNumber {
	
	 public int singleNumber(int[] nums) {
		// Corner case  
	     if(nums == null || nums.length == 0){  
	         return 0;  
	     }  
		 int output = 0;
		 for(int i=0;i<nums.length;i++){
			 output=output^nums[i];
			 
		 }
		 return output;
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleNumber singleNumber = new SingleNumber();
		int[] nums = {1,1,3,2,3};
		System.out.println(singleNumber.singleNumber(nums));

	}

}
