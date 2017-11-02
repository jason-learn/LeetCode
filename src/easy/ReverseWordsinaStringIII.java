package easy;

 
public class ReverseWordsinaStringIII {
	public String reverseWord(String s){
		
		String result ="";
		for(int i=s.length()-1;i>=0;i--){
			 result+=s.charAt(i);				
		}
		return result;
	}
	
	public String reverseWords(String s) {
		String[] arrays = s.split(" "); //按空格分开为字符串数组
		String result = reverseWord(arrays[0]);
		for(int i=1;i<arrays.length;i++){
			result+=" "+reverseWord(arrays[i]);
		}
		
		return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordsinaStringIII reverseWordsinaStringIII = new ReverseWordsinaStringIII();
		System.out.println(reverseWordsinaStringIII.reverseWords("Let's take LeetCode contest"));

	}

}
