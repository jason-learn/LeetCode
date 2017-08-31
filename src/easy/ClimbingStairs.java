package easy;

//70. Climbing Stairs
public class ClimbingStairs {
	public int climbingStairs(int n){
		// fabonacci数列，找规律
		if(n==0 || n==1 || n==2) return n;
		int[] steps = new int[n];
		steps[0]=1;
		steps[1]=2;
		
		for(int i=2;i<n;i++){
			steps[i] =  steps[i-1]+steps[i-2];
		}
		
		return steps[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStairs c = new ClimbingStairs();
		System.out.println(c.climbingStairs(4));

	}

}
