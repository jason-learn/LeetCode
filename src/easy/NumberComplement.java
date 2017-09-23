package easy;

 
//476. Number Complement  ,本题就是将num置反，考虑到output和num相加正好全为1，总和为2的num个数次方
public class NumberComplement {
	public int findComplement(int num) {
		int tmp = num;    //先保存原先的num
		int count =0;     //记录num的位数
		while(num!=0){
			num = num>>1; //循环右移
			count++;
		}
		return (int)(Math.pow(2, count)-tmp-1);  //注意这里2的count次方是double类型，要将整体计算完后（32bit）转化为int
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberComplement numberComplement = new NumberComplement();
		int Output = numberComplement.findComplement(2147483647);
		System.out.println(Output);

	}

}
