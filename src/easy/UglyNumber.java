package easy;

//263. Ugly Number
public class UglyNumber {
	public boolean isUgly(int num){
		//只有2,3,5可以整除
		for(int i=2;i<6&&num>0;i++){
			while(num%i==0)
				num=num/i;
		}
		return num==1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
