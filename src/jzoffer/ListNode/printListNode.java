package ListNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

//输入一个链表，从尾到头打印链表每个节点的值。
public class printListNode {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> output = new ArrayList<>();
		//借助栈来实现先进后出
		Stack<Integer> s = new Stack<>();
		
		while(listNode!=null){
			s.push(listNode.val);
			listNode = listNode.next;
		}
		
		while(!s.isEmpty()){
			output.add(s.pop());
		}
		return output;
	}
	static ArrayList<Integer> result;
	public static void get(ListNode listNode){
		if(listNode!=null){
			get(listNode.next);
			result.add(listNode.val);
		}
	}
	public ArrayList<Integer> printListFromTailToHead2(ListNode listNode){
		result = new ArrayList<>();
		get(listNode);
		return result;
	}

	public static void main(String[] args) {
		printListNode p =  new printListNode();
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		l1.next = l2;
		ArrayList<Integer> output = new ArrayList<>();
		output = p.printListFromTailToHead2(l1);
		//使用iterator遍历
		Iterator<Integer> iterator = output.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//使用foreach方式遍历
		for(Integer i:output){
			System.out.println(i);
		}

	}

}
