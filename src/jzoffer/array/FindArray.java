package array;

//二维数组的查找
public class FindArray {
	//返回数字在二维数组中的位置
	//行递增，列递增，
	//从左下角开始遍历，左下角大于target剔除行，左下角小于target剔除行
	public boolean Find(int target,int[][] array){
		if(array==null ||array.length==0||(array.length==1&&array[0].length==0))
			return false;
		//先得到数组的行和列,刚开始row=array.length-1，column=0
		int row = array.length-1;
		int column = 0;
		while(row>=0 && column<=array.length-1){
			if(array[row][column]==target)
				return true;
			else if(array[row][column]>target)
				row--;
			else if(array[row][column]<target)
				column++;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindArray find = new FindArray();
		System.out.println(find.Find(16,null));

	}

}
