package easy;

//520. Detect Capital
public class DetectCapital {
	//计算小写字符的数量
	public int detectSameclass(String restword){
		int SameLowerCount = 0;
		for(int i=0;i<restword.length();i++){
			if(Character.isLowerCase(restword.charAt(i))){
				SameLowerCount++;
			}
		}
		return SameLowerCount;
	 
		
	}
	public boolean detectCapitalUse(String word) {
		//如果只有一个字符，不管大小写都是true
		if(word.length()==1){
			return true;
		}
		//如果第一个字符是小写，则后面都是小写
		if(Character.isLowerCase(word.charAt(0))){
			//去除第一个字符,非常要主要endIndex是定位到最后一个前面的
			String restword = word.substring(1,word.length());
			//后面的小写数量=字符数量
			if(detectSameclass(restword)==restword.length())
				return true;
		}
		else{
			String restword = word.substring(1,word.length());
			if((detectSameclass(restword)==restword.length())||(detectSameclass(restword)==0))
				return true;
			
		}
		
		return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DetectCapital detectCapital = new DetectCapital();
		System.out.println(detectCapital.detectCapitalUse("FlaG")); 

	}

}
