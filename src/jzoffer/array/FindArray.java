package array;

//��ά����Ĳ���
public class FindArray {
	//���������ڶ�ά�����е�λ��
	//�е������е�����
	//�����½ǿ�ʼ���������½Ǵ���target�޳��У����½�С��target�޳���
	public boolean Find(int target,int[][] array){
		if(array==null ||array.length==0||(array.length==1&&array[0].length==0))
			return false;
		//�ȵõ�������к���,�տ�ʼrow=array.length-1��column=0
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
