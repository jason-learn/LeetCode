package easy;

import java.util.Arrays;

//167. Two Sum II - Input array is sorted
public class TwoSumIIInputarrayissorted {
	public int[] twoSum(int[] numbers,int target){
		int[] output = new int[2];
		if(numbers==null || numbers.length<2) return output;
		int left=0;
		int right=numbers.length-1;
		//´Ó×óÓÒÁ½±ß
		while(left<right){
			if(numbers[left]+numbers[right]==target){
				output[0]=left+1;
				output[1]=right+1;
				break;
			}
			else if(numbers[left]+numbers[right]<target){
				left++;
			}
			else right--;
			 
			
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoSumIIInputarrayissorted t = new TwoSumIIInputarrayissorted();
		int[] numbers={2, 7, 11, 15};
		System.out.println(Arrays.toString(t.twoSum(numbers, 9)));

	}

}
