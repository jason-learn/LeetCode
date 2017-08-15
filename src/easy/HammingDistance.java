package easy;
import java.util.concurrent.CountDownLatch;

import javax.security.auth.x500.X500Principal;
import javax.xml.transform.Templates;

//461. Hamming Distance
public class HammingDistance {
	
	//不递归的方法
	public int hammingDistance(int x, int y) {
        //计算异或之后1所出现的次数
        int t = x ^ y;
        int count = 0;
        while(t != 0){
            if(t % 2 == 1){  //如果最低位为1，记录下来
                count++;
            }
            t /= 2;          //异或之后的结果向右移一位
        }
        return count;
    }
	
	//递归的解法
	public int hammingDistance2(int x,int y){
		int t = x^y;
		if(t==0)              //递归需要有终结条件，最后一步异或结果为0
			return 0;
		return t%2+hammingDistance2(x/2, y/2);
	}
	
	public static void main(String[] args){
		HammingDistance hammingDistance = new HammingDistance();
		int a = hammingDistance.hammingDistance(1, 4);
		HammingDistance h = new HammingDistance();
		int b = h.hammingDistance2(1, 4);
		
		System.out.println(a);
		System.out.println(b);
	}
			 
	 

}
