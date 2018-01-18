package easy;

public class ValidAnagram {
	public boolean isAnagram(String s,String t){
		//设置一个hash数组,标记每一个字母的次数
		int[] tab= new int[26];
		for(int i=0;i<t.length();i++){
			tab[t.charAt(i)-'a']++;
		}
		//对出现过的去除
		for(int j=0;j<s.length();j++){
			tab[s.charAt(j)-'a']--;
		}
		//如果hash数组没有重新变为0，则return false
		for(int i=0;i<26;i++){
			if(tab[i]!=0) return false;
		}
		return true;
	}
	
	public static void main(String args[]){
		ValidAnagram v = new ValidAnagram();
		String s = "rat";
		String t = "car";
		System.out.println(v.isAnagram(s, t));
	}

}
