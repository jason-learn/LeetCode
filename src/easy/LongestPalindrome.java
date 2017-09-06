package easy;

//409. Longest Palindrome
public class LongestPalindrome {
	public int longestPalindrome(String s){
		//利用hash数组记录每个字母出现的次数,26个大写，6个其他字符，26个小写
		int[] hash = new int[58];
		for(int i=0;i<s.length();i++){
			hash[s.charAt(i)-'A']++;
		}
		int singlenum=0;		 
		//记录每个数组中字母出现偶数次和奇数次
		int output=0;
		for(int j=0;j<58;j++){
			if(hash[j]>0){
				//偶数次个数，奇数次
				if(hash[j]%2==0) output+=hash[j];
				else {
					singlenum++;
					output+=hash[j]-1;
				}
			}
		}
		if(singlenum>0) return output+1;
		else return output;
	}
	public static void main(String []args){
		String s="zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
		LongestPalindrome l = new LongestPalindrome();
		System.out.println(l.longestPalindrome(s));
	}

}
