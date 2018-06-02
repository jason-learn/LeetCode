package RecursionAndIteration;


public class Fibonacci {
	
	 public static int fibonacci(int n) {  
		  
	        // ���������������ʱ�򷵻�0  
	        if (n <= 0) {  
	            return 0;  
	        }  
	  
	        // ����1����2��ʱ�򷵻�1  
	        if (n == 1 || n == 2) {  
	            return 1;  
	        }  
	  
	        // ��¼ǰ��������n-2������Fibonacci����ֵ  
	        int prePre = 1;  
	        // ��¼ǰ��������n-1������Fibonacci����ֵ  
	        int pre = 1;  
	        // ��¼ǰ��������n������Fibonacci����ֵ  
	        int current = 2;  
	  
	        // ����n����Fibonacci����ֵ  
	        for (int i = 3; i <= n ; i++) {  
	            // ���i����Fibonacci����ֵ  
	            current = prePre + pre;  
	            // ���¼�¼�Ľ����prePreԭ�ȼ�¼��i-2��Fibonacci����ֵ  
	            // ���ڼ�¼��i-1��Fibonacci����ֵ  
	            prePre = pre;  
	            // ���¼�¼�Ľ����preԭ�ȼ�¼��i-1��Fibonacci����ֵ  
	            // ���ڼ�¼��i��Fibonacci����ֵ  
	            pre = current;  
	        }  
	  
	        // ��������Ľ��  
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
