package easy;

//27. Remove Element
public class RemoveElement {
	public int removeElement(int[] nums, int val) {
		int begin =0;
		for(int i=0;i<nums.length;i++){
			//去除掉和val一样的值
			if(nums[i]!=val)
				nums[begin++]=nums[i];
		}
		return begin;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
