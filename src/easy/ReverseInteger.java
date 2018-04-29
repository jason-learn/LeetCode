package easy;

//LeetCode-7. Reverse Integer
//��תint���֣���Ҫע����Ƿ�������ͷ�Χ��������⣬������ͨ��
public class ReverseInteger {
	public int reverse(int x){
		//ʹ��long�ȷ�ת�����ж��Ƿ����
		long res = 0;
        while (x != 0) {
            res = 10 * res + x % 10;
            x /= 10;
        }
        return (int) ((res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) ? 0 : res);
	}

	public static void main(String[] args) {
		ReverseInteger reverseInteger = new ReverseInteger();
		System.out.println(reverseInteger.reverse(Integer.MIN_VALUE));

	}

}
