package easy;

import java.util.HashSet;
import java.util.Set;

//202. Happy Number
public class HappyNumber {
	public boolean isHappy(int n){
		//将平方和保存到hashset中
		Set<Integer> inLoop = new HashSet<Integer>();
	    int squareSum,remain;
		while (inLoop.add(n)) {
			squareSum = 0;
			while (n > 0) {
				//最后一位
			    remain = n%10;
				squareSum += remain*remain;
				//去除最后一位
				n /= 10;
			}
			if (squareSum == 1)
				return true;
			else
				n = squareSum;
		}
		return false;
	}
	
	public static void main(String []args){
		HappyNumber h = new HappyNumber();
		System.out.println(h.isHappy(19));
	}

}
