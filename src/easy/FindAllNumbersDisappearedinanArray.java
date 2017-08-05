package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
		 List<Integer> list = new ArrayList<Integer>();
		 if(nums == null || nums.length == 0)
	            return list;
	      
	     int[] flag = new int[nums.length];
	     //先将标志位全部置为1
	     Arrays.fill(flag, -1);
	     //每一个数字将其填入对应的标志位
	     for(int i = 0;i < nums.length;i++)
	    	 flag[nums[i] - 1] = nums[i];
         for(int i = 0;i < nums.length;i++){
             if(flag[i] == -1)
                list.add(i + 1);
         }
         return list;
	        
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllNumbersDisappearedinanArray findAllNumbersDisappearedinanArray = new FindAllNumbersDisappearedinanArray();
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findAllNumbersDisappearedinanArray.findDisappearedNumbers(nums));

	}

}
