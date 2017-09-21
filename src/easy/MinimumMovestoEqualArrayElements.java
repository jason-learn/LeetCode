package easy;
import java.util.Arrays;

//453. Minimum Moves to Equal Array Elements
public class MinimumMovestoEqualArrayElements {
	public int minMoves(int[] nums) {
//		把最小的n-1个元素都加1，相当于所有元素都加1，最大的元素减一，因为题目要求最后的元素值相同即可，所以所有元素加一操作完全可以去掉，
//		即每一次的“移动”操作等价于把最大元素减一。最终状态为每个元素都等于初始数组的最小值，sum(nums)-min(nums)*len(nums)。
		Arrays.sort(nums);
		int moves=0;
		for(int i=1;i<nums.length;i++){
			moves+=nums[i]-nums[0];
		}		
		return moves;	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinimumMovestoEqualArrayElements m = new MinimumMovestoEqualArrayElements();
		int[] nums={1,2,3};
		System.out.println(m.minMoves(nums));

	}

}
