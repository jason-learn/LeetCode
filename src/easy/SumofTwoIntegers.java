package easy;

// 371. Sum of Two Integers

public class SumofTwoIntegers {
	
	int add =0;
	public int getSum(int a, int b) {
		 
		int yuanwei = a^b;  //每位要进行异或
		int jinwei = (a&b)<<1; //进位左移
		if((yuanwei&jinwei)==0){//如果不需要迭代可以直接返回
			return yuanwei | jinwei;
		}
		else{  //原位和进位的加计算要继续进行迭代
		 
			add = getSum(yuanwei,jinwei);
		}
		 
		return add;
        
    }
	
	public int getSum2(int a, int b) {
        int result = a ^ b; // 按位加
        int carray = (a & b) << 1; // 计算进位
        if(carray!=0) return  getSum(result,carray); //判断进位与处理
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofTwoIntegers s = new SumofTwoIntegers();
		System.out.println(s.getSum(20, 30));

	}

}
