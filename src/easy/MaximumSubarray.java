package easy;

import java.util.Arrays;

//53. Maximum Subarray
public class MaximumSubarray {
	public int maxSubArray(int[] nums){
		//标记数组中从每一位开始以后的subarray得到的最大值
		int[] eachMax = new int[nums.length];
		for(int i=0;i<nums.length;i++){	
			if(i==nums.length-1)
			{
				eachMax[i]=nums[i];
				break;
			}
			else{
				int[] eachmax = new int[nums.length-i];
				eachmax[0]=nums[i];
				//每一位向后若干位的和					
				for(int j=i+1;j<nums.length;j++){
					eachmax[j-i]=nums[j]+eachmax[j-i-1];
				}
				Arrays.sort(eachmax);
				//找出从每一位开始的subarray得到的最大值
				eachMax[i]=eachmax[nums.length-i-1];
			}
			
		}
		Arrays.sort(eachMax);
		return eachMax[nums.length-1];
	}
	public int maxSubArray2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with nums[i];
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = nums[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums={-2,1,-3,4,-1,2,1,-5,4};
		MaximumSubarray m = new MaximumSubarray();
		System.out.println(m.maxSubArray(nums));

	}

}
