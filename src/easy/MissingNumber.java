package easy;

//268. Missing Number
public class MissingNumber {
	public int missingNumber(int[] nums){
		//n+1个标志位
		int[] flag = new int[nums.length+1];
		//如果该数字存在，则在相应位置置为1
		for(int i=0;i<nums.length;i++){
			flag[nums[i]]++;
		}
		for(int j=0;j<flag.length;j++){
			if(flag[j]==0){
				return j;
			}
		}
		return 0; 
	}
	
	public static void main(String []args){
		int[] nums = { 1,0, 3};
		MissingNumber m = new MissingNumber();
		System.out.println(m.missingNumber(nums));
	}

}
