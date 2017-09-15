package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class MinimumIndexSumofTwoLists {
	public String[] findRestaurant(String[] list1, String[] list2) {
		ArrayList<String> output = new ArrayList<>();
		 
		HashMap<String,Integer> h= new HashMap<String,Integer>();
		for(int i=0;i<list1.length;i++){
			for(int j=0;j<list2.length;j++){
				if(list1[i].equals(list2[j])){
					h.put(list1[i],i+j);
				}
			}
		}
		Iterator iterator=h.keySet().iterator();
		int min_value=list1.length+list2.length;
		//找出所有key-value中最小的key
		while(iterator.hasNext()){
			String tmp=iterator.next().toString();
			 
			int value = (int)h.get(tmp);
			min_value=Math.min(min_value, value);
		}
		 
		Iterator it=h.keySet().iterator();
		//找出最小value的字符串加入ArrayList
		while(it.hasNext()){
			String tmp=it.next().toString();
			int value = (int)h.get(tmp);			 
			if(value==min_value){				 
				output.add(tmp);
			}
		}
		String[] result = (String[])output.toArray(new String[output.size()]);
		//System.out.println(output.size());
		return result;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list1= {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2= {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		MinimumIndexSumofTwoLists m = new MinimumIndexSumofTwoLists();
		System.out.println(Arrays.toString(m.findRestaurant(list1, list2)));

	}

}
