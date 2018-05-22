package StackAndQueue;

import java.util.Stack;

//利用栈来实现队列的删除和插入
public class stackandqueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node) {
        stack1.push(node);
    }
     
    public int pop() {
        if(stack1.empty()&&stack2.empty()){
            throw new RuntimeException("Queue is empty!");
        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
