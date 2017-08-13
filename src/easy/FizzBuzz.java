package easy;
import java.util.*;

//412. Fizz Buzz
public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> list = new ArrayList<String>();
		for(int i=1;i<n+1;i++){
			if((i%3==0)&&(i%5==0)){    //尽量使用i%15==0效率更高
				list.add("FizzBuzz");
			}
			
			else if(i%3==0){
				list.add("Fizz");
			}
			else if(i%5==0){
				list.add("Buzz");
			}
			else 
				list.add(String.valueOf(i));
		}
		return list;
		
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz ffizzBuzz = new FizzBuzz();
		List aList = ffizzBuzz.fizzBuzz(15);
		System.out.println(aList);

	}

}
