package easy;

 
//476. Number Complement  ,������ǽ�num�÷������ǵ�output��num�������ȫΪ1���ܺ�Ϊ2��num�����η�
public class NumberComplement {
	public int findComplement(int num) {
		int tmp = num;    //�ȱ���ԭ�ȵ�num
		int count =0;     //��¼num��λ��
		while(num!=0){
			num = num>>1; //ѭ������
			count++;
		}
		return (int)(Math.pow(2, count)-tmp-1);  //ע������2��count�η���double���ͣ�Ҫ������������32bit��ת��Ϊint
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberComplement numberComplement = new NumberComplement();
		int Output = numberComplement.findComplement(2147483647);
		System.out.println(Output);

	}

}
