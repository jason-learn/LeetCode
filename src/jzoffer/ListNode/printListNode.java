package ListNode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

//����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ��
public class printListNode {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		ArrayList<Integer> output = new ArrayList<>();
		//����ջ��ʵ���Ƚ����
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
		//ʹ��iterator����
		Iterator<Integer> iterator = output.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//ʹ��foreach��ʽ����
		for(Integer i:output){
			System.out.println(i);
		}

	}

}
