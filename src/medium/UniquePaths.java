package medium;

//LeetCode-62-Unique Paths(动态规划)-Medium  
//最简单的动态规划，种类数，是上一个位置的个数，加上左边一个位置的个数
public class UniquePaths {
	public int uniquePaths(int m, int n) {  
        int[][] array=new int[m][n];  
        for(int i=0; i<m;i++){  
            for(int j=0;j<n;j++){  
                array[i][j]=1;  
            }  
        }  
          
        for(int i=1; i<m;i++){  
            for(int j=1;j<n;j++){  
                array[i][j]=array[i-1][j]+array[i][j-1];  
            }  
        }  
          
        return array[m-1][n-1];  
    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
