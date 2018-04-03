package medium;

//537. Complex Number Multiplication
public class ComplexNumberMultiplication {
	public String complexNumberMultiply(String a,String b){
		//字符"|","*","+"都得加上转义字符，前面加上"\\"
		String[] complexa = a.split("\\+");
		String[] complexb = b.split("\\+");
		 
		int a1 = Integer.parseInt(complexa[0]);
		//subString方法截取字符串,beginIndex为开始处的索引（包括该位置）,endIndex为结束索引（不包括该索引位置）
		int a2 = Integer.parseInt(complexa[1].substring(0, complexa[1].length()-1));
		int b1 = Integer.parseInt(complexb[0]);
		int b2 = Integer.parseInt(complexb[1].substring(0, complexb[1].length()-1));
		
		int c1 = a1*b1-a2*b2;
		int c2 = a1*b2+a2*b1;
		String c = String.valueOf(c1)+"+"+String.valueOf(c2)+"i";
		
		return c;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumberMultiplication c = new ComplexNumberMultiplication();
		String a ="1+-1i";
		String b ="1+-1i";
		System.out.println(c.complexNumberMultiply(a, b));
		

	}

}
