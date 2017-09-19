package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
		 int zeroCount=0;//��¼ǰ����ֵ�0�ĸ���
		 for(int i=0;i<nums.length;i++){
			 if(nums[i]==0){
				 zeroCount++;
			 }
			 else {
				 nums[i-zeroCount]=nums[i]; //��0����ǰ��
			}
		 }
		 //��󽫺��涼��λ0
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
