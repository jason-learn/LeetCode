package easy;

//198. House Robber
public class HouseRobber {
	public int rob(int[] num) {
//		这题可以看做是简单的DP问题，用A[0]表示没有rob当前house的最大money，A[1]表示rob了当前house的最大money，那么A[0] 等于rob或者没有rob上一次house的最大值
//		即A[i+1][0] = max(A[i][0], A[i][1])..  那么rob当前的house，只能等于上次没有rob的+money[i+1], 则A[i+1][1] = A[i][0]+money[i+1].
//		实际上只需要两个变量保存结果就可以了，不需要用二维数组
		int best0 = 0; //表示没有选择当前house
		int best1 = 1; //表示选择了当前house
		for(int i=0;i<num.length;i++){
			int temp = best0;
			best0 = Math.max(best0,best1); // 没有选择当前houses，那么它等于上次选择了或没选择的最大值  
			best1 = temp + num[i]; // 选择了当前houses，值只能等于上次没选择的+当前houses的money
		}
		return Math.max(best0, best1);
    }
//	这是一道动态规划问题。 
//	我们维护一个一位数组dp，其中dp[i]表示到i位置时不相邻数能形成的最大和。 
//	状态转移方程：
//
//	dp[0] = num[0] （当i=0时）
//	dp[1] = max(num[0], num[1]) （当i=1时）
//	dp[i] = max(num[i] + dp[i - 2], dp[i - 1])   （当i !=0 and i != 1时）
	public int rob2(int[] num){
		if(num.length==0) return 0;
		if(num.length==1) return num[0];
		num[1] = Math.max(num[0],num[1]);
		for(int i=2;i<num.length;i++){
			num[i]=Math.max(num[i-2]+num[i],num[i-1]);
		}
		return num[num.length-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseRobber h = new HouseRobber();
		int[] nums ={4,1,2};
		System.out.println(h.rob2(nums));

	}

}
