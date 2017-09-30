package easy;

//231. Power of Two
public class PowerofTwo {
	//2的n次幂只有首位是1后面是0,2的n次幂-1首位是0后面都是1 
	//trick n&(n-1)==0 .
	public boolean isPowerOfTwo(int n) {  
	       return n > 0 && ((n & (n - 1)) == 0 );  
	    }  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
