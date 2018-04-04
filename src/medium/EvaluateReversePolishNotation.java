package medium;

import java.util.Stack;


////150. Evaluate Reverse Polish Notation 注意stack中取出数据的顺序
public class EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens) {
		Stack<String> s = new Stack<String>();
		for(int i=0;i<tokens.length;i++){
			if(tokens[i].equals("+")){
				int b = Integer.parseInt(s.pop());
				int a = Integer.parseInt(s.pop());
				s.push(String.valueOf(a+b));
				
			}
			else if(tokens[i].equals("-")){
				int b = Integer.parseInt(s.pop());
				int a = Integer.parseInt(s.pop());
				s.push(String.valueOf(a-b));
			}
			else if(tokens[i].equals("*")){
				int b = Integer.parseInt(s.pop());
				int a = Integer.parseInt(s.pop());
				s.push(String.valueOf(a*b));
			}
			else if(tokens[i].equals("/")){
				int b = Integer.parseInt(s.pop());
				int a = Integer.parseInt(s.pop());
				s.push(String.valueOf(a/b));
			}
			else s.push(tokens[i]);
		}
		int result = Integer.parseInt(s.pop());
        return result;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s ={"2", "1", "+", "3", "*"};
		EvaluateReversePolishNotation e = new EvaluateReversePolishNotation();
		System.out.println(e.evalRPN(s));

	}

}
