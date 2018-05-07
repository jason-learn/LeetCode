package array;

/*
问题1：替换字符串，是在原来的字符串上做替换，还是新开辟一个字符串做替换！
问题2：在当前字符串替换，怎么替换才更有效率（不考虑java里现有的replace方法）。
      从前往后替换，后面的字符要不断往后移动，要多次移动，所以效率低下
      从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次，这样效率更高一点。
*/
public class ReplaceSpaceArray {
	public String replaceSpace(StringBuffer str){
		int spacenum = 0;//统计空格数目
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				spacenum++;
		}
		int indexold = str.length()-1;  //替换前的str下标
		int newlength = str.length()+spacenum*2; //计算转换后的新长度
		int indexnew = newlength-1; //替换后的str下标
		str.setLength(newlength);
		for(;indexold>=0&&indexold<newlength;indexold--){
			 
			if(str.charAt(indexold)==' '){  
				str.setCharAt(indexnew--, '0');
				str.setCharAt(indexnew--, '2');
				str.setCharAt(indexnew--, '%');
			}
		 
			else {
				str.setCharAt(indexnew--, str.charAt(indexold));
			}
		}
		//将stringbuffer对象转换Wiestring对象
		return str.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceSpaceArray r = new ReplaceSpaceArray();
		//将string对象转换为stringbuffer对象
		StringBuffer str = new StringBuffer("we are happy");
		System.out.println(r.replaceSpace(str));

	}

}
