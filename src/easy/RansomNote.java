package easy;

//383. Ransom Note

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine){
		int[] hash = new int[26];
		//��¼ÿ���ַ����ֵĴ���
		for(int i=0;i<magazine.length();i++){
			hash[magazine.charAt(i)-'a']++;
		}
		//��ransomNoteÿ����һ�ξͼ�1
		for(int j=0;j<ransomNote.length();j++){
			if(--hash[ransomNote.charAt(j)-'a']<0){
				return false;
			}
		}
		 
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote ransomNote= new RansomNote();
		System.out.println(ransomNote.canConstruct("aa", "aba"));

	}

}
