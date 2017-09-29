package easy;

import java.util.Arrays;

//66. Plus One
public class PlusOne {
	public int[] plusOne(int[] digits){
		//从最低位开始遍历如果小于9则++，如果是9则变为0进位
		for(int i=digits.length-1;i>=0;i--){
			if(digits[i]<9){
				digits[i]++;
				return digits;
			}
			else  digits[i]=0;
		}
		//如果所有的都变为了0需要在前面加一个1
		if(digits[0]==0){
			int[] newdigits = new int[digits.length+1];
			newdigits[0] = 1;
			return newdigits;
		}
		return digits;
		 
	}
	public static void main(String []args){
		PlusOne p = new PlusOne();
		int[] digits ={9,9,9};
		System.out.println(Arrays.toString(p.plusOne(digits)));
	}
	

}
