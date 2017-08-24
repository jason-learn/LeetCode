package easy;

//258. Add Digits
public class AddDigits {
	public int addDigits(int num) {
		if(num==0){
		return 0;
		}
		else return 1+(num-1)%9;	        
	}
	//一个个找规律
	 public int addDigits2(int num) {
	        return num==0?0:(num%9==0?9:(num%9));
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddDigits a = new AddDigits();
		System.out.println(a.addDigits(38));

	}

}
