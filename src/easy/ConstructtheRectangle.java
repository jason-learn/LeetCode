package easy;

import java.util.Arrays;

//492. Construct the Rectangle
public class ConstructtheRectangle {
	 public int[] constructRectangle(int area) {
		 int[] output=new int[2];	  
		 for(int width=(int)Math.sqrt(area);width>0;width--){			  
			 if(area%width==0){
				output[0]=area/width; //length
				output[1]=width; //width
				break;				
			 }
		 }
		 return output;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructtheRectangle c = new ConstructtheRectangle();
		System.out.println(Arrays.toString(c.constructRectangle(1)));

	}

}
