package easy;
import java.util.*;

import java.util.Stack;

//344. Reverse String
public class ReverseString {
	 public String reverseString(String s) {
		 char[] tmp = new char[s.length()];
		 for(int i=0;i<s.length();i++){
			 tmp[i]=s.charAt(s.length()-1-i);  //���ø�ֵ
		 }
		 return String.valueOf(tmp);  //��char����ת��Ϊstring���
		 
		  
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString reverseString = new ReverseString();
		System.out.println(reverseString.reverseString("hello"));
		 
	}

}
