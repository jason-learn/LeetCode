package RecursionAndIteration;


public class Fibonacci {
	
	 public static int fibonacci(int n) {  
		  
	        // 当输入非正整数的时候返回0  
	        if (n <= 0) {  
	            return 0;  
	        }  
	  
	        // 输入1或者2的时候返回1  
	        if (n == 1 || n == 2) {  
	            return 1;  
	        }  
	  
	        // 记录前两个（第n-2个）的Fibonacci数的值  
	        int prePre = 1;  
	        // 记录前两个（第n-1个）的Fibonacci数的值  
	        int pre = 1;  
	        // 记录前两个（第n个）的Fibonacci数的值  
	        int current = 2;  
	  
	        // 求解第n个的Fibonacci数的值  
	        for (int i = 3; i <= n ; i++) {  
	            // 求第i个的Fibonacci数的值  
	            current = prePre + pre;  
	            // 更新记录的结果，prePre原先记录第i-2个Fibonacci数的值  
	            // 现在记录第i-1个Fibonacci数的值  
	            prePre = pre;  
	            // 更新记录的结果，pre原先记录第i-1个Fibonacci数的值  
	            // 现在记录第i个Fibonacci数的值  
	            pre = current;  
	        }  
	  
	        // 返回所求的结果  
	        return current;  
	    }  

	public static void main(String[] args) {
		Fibonacci f1 = new Fibonacci();
		System.out.println(f1.fibonacci(0));  
        System.out.println(f1.fibonacci(1));  
        System.out.println(f1.fibonacci(2));  
        System.out.println(f1.fibonacci(3));  
        System.out.println(f1.fibonacci(4));  
        System.out.println(f1.fibonacci(5));  
        System.out.println(f1.fibonacci(6));  
        System.out.println(f1.fibonacci(7));  

	}

}
