package easy;

// 371. Sum of Two Integers

public class SumofTwoIntegers {
	
	int add =0;
	public int getSum(int a, int b) {
		 
		int yuanwei = a^b;  //ÿλҪ�������
		int jinwei = (a&b)<<1; //��λ����
		if((yuanwei&jinwei)==0){//�������Ҫ��������ֱ�ӷ���
			return yuanwei | jinwei;
		}
		else{  //ԭλ�ͽ�λ�ļӼ���Ҫ�������е���
		 
			add = getSum(yuanwei,jinwei);
		}
		 
		return add;
        
    }
	
	public int getSum2(int a, int b) {
        int result = a ^ b; // ��λ��
        int carray = (a & b) << 1; // �����λ
        if(carray!=0) return  getSum(result,carray); //�жϽ�λ�봦��
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofTwoIntegers s = new SumofTwoIntegers();
		System.out.println(s.getSum(20, 30));

	}

}
