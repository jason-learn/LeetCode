package easy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
	public String test(String s){
		int[] test1 = new int[58];
		List<Integer> test2 = new ArrayList<Integer>();
		List<Integer> test3 = new ArrayList<Integer>();
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)>65){
				test1[s.charAt(i)-'A']++;
			}
			else{
				//test2.add(Integer.parseInt(String.valueOf((s.charAt(i)))));
				//test2.add(Integer.parseInt(String.valueOf((s.charAt(i))+"")));
				test2.add(Integer.valueOf(s.charAt(i)));
			}
		}
		for(int j=0;j<26;j++){
			while(test1[j]>0){
				test3.add('A'+j);
				test1[j]--;
			}
			while(test1[j+32]>0){
				test3.add('a'+j);
				test1[j+32]--;
			}
			
		}
		 Iterator it = test2.iterator();
	        while(it.hasNext()){
	            test3.add(Integer.parseInt(String.valueOf(it.next())));
	        }
	      
	        //String str= String.Join(",", (string[])list.ToArray(typeof( string)));
	        String output=test3.toString();
	        return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="51CBaAD";
		test t = new test();
		System.out.println(t.test(a));
		

	}

}
