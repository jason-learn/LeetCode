package easy;

//485. Max Consecutive Ones
public class MaxConsecutiveOnes {
	
	public int findMaxConsecutiveOnes(int[] nums) {
		int consecutives = 0;
		int maxconsecutives = 0; //�������������
		for(int i=0;i<nums.length;i++){
			if(nums[i]==1){      //����1����������������
				consecutives++;
				 
			}
			if(nums[i]==0){      //����0��ֱ�ӽ���������Ϊ0
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
