package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

//349. Intersection of Two Arrays
//利用Java中set的不可以包括两个重复元素的特性，第一次先将nums1放到一个一个set中，
//第二次再来寻找nums2中的元素，如果在set中，就将其放到最后的结果中
public class IntersectionofTwoArrays {
	 public int[] intersection(int[] nums1, int[] nums2) {
		 HashSet<Integer> output= new HashSet<Integer>();
		 HashSet<Integer> num= new HashSet<>();
		 for(int i=0;i<nums1.length;i++){
			 num.add(nums1[i]);
		 }
		 for(int j=0;j<nums2.length;j++){
			 if(num.contains(nums2[j]))
				 output.add(nums2[j]);
		 }
		 int[] result = new int[output.size()];
//		 int index=0;
//		 for(int nu:output)
//			 result[index++]=nu;
//		 return result;
		 int index=0;
		 Iterator<Integer> i= output.iterator();
		 while(i.hasNext())
			 result[index++]=i.next();
		 
		 return result;
	        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={1,2,2,1};
		int[] nums2={2,2};
		IntersectionofTwoArrays intersectionofTwoArrays = new IntersectionofTwoArrays();
		System.out.println(Arrays.toString(intersectionofTwoArrays.intersection(nums1, nums2)));

	}

}
