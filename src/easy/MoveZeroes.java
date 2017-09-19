package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
		 int zeroCount=0;//记录前面出现的0的个数
		 for(int i=0;i<nums.length;i++){
			 if(nums[i]==0){
				 zeroCount++;
			 }
			 else {
				 nums[i-zeroCount]=nums[i]; //非0数字前移
			}
		 }
		 //最后将后面都补位0
		 for(int j=nums.length-zeroCount;j<nums.length;j++){
			 nums[j]=0;
		 }
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroes m = new MoveZeroes();
		int[] nums ={0,1,0,3,12};
		m.moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}

}
