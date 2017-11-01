package easy;
import java.util.*;

import java.util.Stack;

//344. Reverse String
public class ReverseString {
	 public String reverseString(String s) {
		 char[] tmp = new char[s.length()];
		 for(int i=0;i<s.length();i++){
			 tmp[i]=s.charAt(s.length()-1-i);  //反置赋值
		 }
		 return String.valueOf(tmp);  //将char数组转化为string输出
		 
		  
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseString("hello"));
		 
	}

}
