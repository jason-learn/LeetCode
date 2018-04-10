package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//442. Find All Duplicates in an Array
public class FindAllDuplicatesinanArray {
	 public List<Integer> findDuplicates(int[] nums) {
		 List<Integer> l = new ArrayList<Integer>();
		 List<Integer> d = new ArrayList<Integer>();
		 for(int i=0;i<nums.length;i++){
			 //将已经出现在l中的值加入到d
			 if(l.contains(nums[i])){
				 d.add(nums[i]);
			 }
			 l.add(nums[i]);
		 }
		 return d;
	        
	 }
	 public List<Integer> findDuplicates2(int[] nums) {		  
		 List<Integer> d = new ArrayList<Integer>();
		 Arrays.sort(nums);
		 //先排序，如果连续两个值相同则将后一个加入d
		 for(int i=1;i<nums.length;i++){
			 if(nums[i]==nums[i-1]) d.add(nums[i]);
		 }
		 return d;
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAllDuplicatesinanArray f = new FindAllDuplicatesinanArray();
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(f.findDuplicates2(nums));

	}

}
