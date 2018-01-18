package easy;

public class ValidAnagram {
	public boolean isAnagram(String s,String t){
		//����һ��hash����,���ÿһ����ĸ�Ĵ���
		int[] tab= new int[26];
		for(int i=0;i<t.length();i++){
			tab[t.charAt(i)-'a']++;
		}
		//�Գ��ֹ���ȥ��
		for(int j=0;j<s.length();j++){
			tab[s.charAt(j)-'a']--;
		}
		//���hash����û�����±�Ϊ0����return false
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
