package easy;

import java.lang.reflect.Array;

import javax.sql.rowset.FilteredRowSet;
import java.util.*;


public class NextGreaterElementI {
	public int[] nextGreaterElement(int[] findNums, int[] nums) {
		int[] tmp = new int[findNums.length];
		for(int i=0;i<findNums.length;i++){  //循环找出findnums数组中的每一个数字的next greater
			int t = 0; //用来标志是否找到了sub的位置
			int j = 0; //标志next greater的位置
			for(;j<nums.length;j++){
				if(nums[j]==findNums[i])     //已经找到了sub位置
					t=1;
				if((t==1)&(findNums[i]<nums[j])){  //找到了next greater
					tmp[i] = nums[j];
					break;
				}
			}
			if(j==nums.length)
				tmp[i] = -1;
		}
		return tmp;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NextGreaterElementI nextGreaterElementI = new NextGreaterElementI();
		int[] findNums = {4,1,2};
		int[] nums = {1,3,4,2};
		int[] output = nextGreaterElementI.nextGreaterElement(findNums,nums);
		System.out.println(Arrays.toString(output));

	}

}
