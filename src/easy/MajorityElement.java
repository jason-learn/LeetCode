package easy;

import java.util.HashMap;
import java.util.Map;

//169. Majority Element
public class MajorityElement {
	 public int majorityElement(int[] nums) {
		 Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		 //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
		 int output=0;
		 for (int num: nums) {
			//看是否已经有这个key
			if (!myMap.containsKey(num))
			    myMap.put(num, 1);
			else
				//value++
			    myMap.put(num, myMap.get(num)+1);
			//如果大于一半就设为majority
			if (myMap.get(num)>nums.length/2) {
			    output = num;
			    break;
			}
		 }
		 return output;
	        
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
