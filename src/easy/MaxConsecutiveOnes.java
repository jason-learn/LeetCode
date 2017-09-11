package easy;

//485. Max Consecutive Ones
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int consecutives = 0;
		int maxconsecutives = 0; //保存最大连续数
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1){      //遇到1就增大连续数个数
				consecutives++;
				 
			}
			if(nums[i]==0){      //遇到0就直接将连续数置为0
				consecutives=0;
			}
			if(consecutives>maxconsecutives){
				maxconsecutives = consecutives;
			}
		}
			
		
		return maxconsecutives;
		       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
		int[]nums ={1,1,0,1,1,1};
		System.out.println(maxConsecutiveOnes.findMaxConsecutiveOnes(nums));

	}

}
