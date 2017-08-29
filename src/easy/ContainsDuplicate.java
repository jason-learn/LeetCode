package easy;

import java.util.HashSet;
import java.util.Set;

// 217. Contains Duplicate
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums){
		//利用hashset的里面值不能重复
		Set s = new HashSet();
		for(int i=0;i<nums.length;i++){
			s.add(nums[i]);
		}
		//set中的值个数与数组中个数是否相同
		if(s.size()!=nums.length) return true;
		return false;
	}
	
	public static void main(String args[]){
		ContainsDuplicate c = new ContainsDuplicate();
		int[] nums = {1,2,3,4,5,1};
		System.out.println(c.containsDuplicate(nums));
	}

}
