package easy;

//LeetCode-7. Reverse Integer
//反转int数字，需要注意的是符号问题和范围溢出的问题，可以先通过
public class ReverseInteger {
	public int reverse(int x){
		//使用long先反转，再判断是否溢出
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
