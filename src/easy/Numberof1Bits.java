package easy;

public class Numberof1Bits {
	public int hammingWeight(int n) {
        int count =0;
        while(n>0){
        	if(n%2==1){
        		count++;
        	}
        	n=n>>1;
        }
		return count;
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberof1Bits n = new Numberof1Bits();
	    System.out.println(Integer.MAX_VALUE);	 
//		System.out.println(n.hammingWeight(2147483648));

	}

}
