package easy;

import java.util.Arrays;

 

//453. Minimum Moves to Equal Array Elements
public class MinimumMovestoEqualArrayElements {
	public int minMoves(int[] nums) {
//		����С��n-1��Ԫ�ض���1���൱������Ԫ�ض���1������Ԫ�ؼ�һ����Ϊ��ĿҪ������Ԫ��ֵ��ͬ���ɣ���������Ԫ�ؼ�һ������ȫ����ȥ����
//		��ÿһ�εġ��ƶ��������ȼ��ڰ����Ԫ�ؼ�һ������״̬Ϊÿ��Ԫ�ض����ڳ�ʼ�������Сֵ��sum(nums)-min(nums)*len(nums)��
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
