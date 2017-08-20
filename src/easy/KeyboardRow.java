package easy;
import java.util.concurrent.CountDownLatch;
import java.util.*;

//500. Keyboard Row
public class KeyboardRow {
	 
	public boolean contain(String a){
		String[] row1 = {"q","w","e","r","t","y","u","i","o","p","Q","W","E","R","T","Y","U","I","O","P"};
		String[] row2 = {"a","s","d","f","g","h","j","k","l","A","S","D","F","G","H","J","K","L"};
		String[] row3 = {"z","x","c","v","b","n","m","Z","X","C","V","B","N","M"};
		int[] flag = new int[a.length()];  //设置一个数组来标志该字符串的每一位属于哪个集合，如果最后数组中数字相同就是一个集合
		for(int i=0;i<a.length();i++){     //遍历每一位字符
			for(int j1=0;j1<20;j1++){      //遍历第一个集合中的字符
				if(a.substring(i,i+1).equals(row1[j1]))  //比较是否属于该集合
					flag[i]=1;
			}
			for(int j2=0;j2<18;j2++){      //遍历第二个集合中的字符
				if(a.substring(i,i+1).equals(row2[j2]))  //比较是否属于该集合
					flag[i]=2;
			}
			for(int j3=0;j3<14;j3++){      //遍历第一个集合中的字符
				if(a.substring(i,i+1).equals(row3[j3]))  //比较是否属于该集合
					flag[i]=3;
			}
		}
		for(int i=0;i<flag.length-1;i++){    //遍历标志数组看是否都相同
			if(flag[i]!=flag[i+1])
				return false;
		}
		return true;
	}
	
	
	//改方法中主要用到了字符串的contains方法，注意只能是string类型是否contains另一个string类型
	public boolean contain2(String a){
		String s1="QWERTYUIOPqwertyuiop";  
	    String s2="ASDFGHJKLasdfghjkl";  
	    String s3="ZXCVBNMzxcvbnm"; 
	    int[] flag = new int[a.length()];
	    for(int i=0;i<a.length();i++){
	    	String n = String.valueOf(a.charAt(i));    //charAt是可以获取一个string中的一个字符
	    	if(s1.contains(n))
	    		flag[i] = 1;
	    	if(s2.contains(n))
	    		flag[i] = 2;
	    	if(s3.contains(n))
	    		flag[i] = 3;
	    	
	    }
	    for(int i=0;i<flag.length-1;i++){    //遍历标志数组看是否都相同
			if(flag[i]!=flag[i+1])
				return false;
		}
	    return true;
		
	}
	
	
	public String[] findWords(String[] words) {
		ArrayList<String> output = new ArrayList<String>();    //使用ArrayList可变大小的数组
		//String[] output= new String[words.length];
		
		
	    
		int count = -1;
		for(int i=0;i< words.length;i++){
			 
			if(contain2(words[i]))           //如果同一数组则加入output
				
				output.add(words[i]);
			
		}
		 
		String[] out = (String[])output.toArray(new String[output.size()]);   //如何将ArrayList转化为string[]
		return out;
	        
	}
	public static void main(String[]args){
		String[] a= {"Hello", "Alaska", "Dad", "Peace"};
		System.out.println(a[0].length());
		KeyboardRow k = new KeyboardRow();
		String[] b = k.findWords(a);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
	}

}
