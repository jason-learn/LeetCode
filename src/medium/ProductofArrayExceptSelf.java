package medium;

import java.util.Arrays;

public class ProductofArrayExceptSelf {
	public int[] productExceptSelf(int[] nums){
		//从复杂度O(n2)到O(n),从简单的两层循环变为两个单层循环，第一个循环储存中间结果
		int n = nums.length;
	    int[] output = new int[n];
	    output[0] = 1;
	    //先计算左边的乘积
	    for (int i = 1; i < n; i++) {
	        output[i] = output[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    //再与右边的乘积
	    for (int i = n - 1; i >= 0; i--) {
	        output[i] *= right;
	        right *= nums[i];
	    }
	    return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		ProductofArrayExceptSelf p = new ProductofArrayExceptSelf();
		System.out.println(Arrays.toString(p.productExceptSelf(nums)));

	}

}
