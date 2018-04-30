package medium;

//96. Unique Binary Search Trees

//dp[2] =  dp[0] * dp[1]������(1Ϊ�������)
//
//+ dp[1] * dp[0]����  (2Ϊ�������)
//
//ͬ���д�� n = 3 �ļ��㷽����
//
//dp[3] =  dp[0] * dp[2]������(1Ϊ�������)
//
//+ dp[1] * dp[1]����  (2Ϊ�������)
//
//  + dp[2] * dp[0]����  (3Ϊ�������)

//���������еĵ���ʽ
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
