package medium;

//96. Unique Binary Search Trees

//dp[2] =  dp[0] * dp[1]　　　(1为根的情况)
//
//+ dp[1] * dp[0]　　  (2为根的情况)
//
//同理可写出 n = 3 的计算方法：
//
//dp[3] =  dp[0] * dp[2]　　　(1为根的情况)
//
//+ dp[1] * dp[1]　　  (2为根的情况)
//
//  + dp[2] * dp[0]　　  (3为根的情况)

//卡塔兰数列的递推式
public class UniqueBinarySearchTrees {
	
	public int numTrees(int n) {
	
       int[] dp = new int[n+1];
       dp[0] = 1;
       dp[1] = 1;
       for(int i=2;i<=n;i++){
    	   for(int j=0;j<i;j++){
    		   dp[i] += dp[j]*dp[i-1-j];
    	   }
       }
       return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
