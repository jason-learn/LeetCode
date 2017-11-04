package easy;

//35. Search Insert Position
public class SearchInsertPosition {
	public int searchInsert(int[] nums,int target){
		if(nums.length==0) return 0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]>=target){
				return i;
			}
		}
		return nums.length;
	}
	
	//其实就是对有序数组进行查找的问题，二分查找效率更高
	public int searchInsert2(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else 
            	if(A[mid] > target) high = mid-1;
            	else low = mid+1;
        }
        return low;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInsertPosition s = new SearchInsertPosition();
		int[] nums ={1,3,5,6};
		int target = 0;
		System.out.println(s.searchInsert(nums, target));

	}

}
