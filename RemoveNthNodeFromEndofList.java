package medium;

//19. Remove Nth Node From End of List
//�ҳ����еĵ����ڼ����ڵ�,һ�α���
//����ָ�룬�ÿ�ָ��������ָ��ǰ��k���ڵ�
public class RemoveNthNodeFromEndofList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
		 //�����쳣���
		 //�����ǿ������Լ���Ҫɾ�����ǵ�����0��
		 if((head==null)||(n<=0)){
			 return null;
		 }
		 if(head.next==null&&n==1){
			 return null;
		 }
		 ListNode slow = head;
		 ListNode fast = head;
		 
		 for(int i=0; i<n; i++){
		        fast = fast.next;
		    }
		 
		    //if remove the first node
		    if(fast == null){
		        head = head.next;
		        return head;
		    }
		 
		    while(fast.next != null){
		        fast = fast.next;
		        slow = slow.next;
		    }
		 
		    slow.next = slow.next.next;
		 
		    return head;
	        
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
/*		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);*/
		l1.next = null;
/*		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;*/
		RemoveNthNodeFromEndofList r = new RemoveNthNodeFromEndofList();
		ListNode newL = r.removeNthFromEnd(l1, 1);
		ListNode visit = newL;
		while(visit!=null){
			System.out.println(visit.val);
			visit = visit.next;
		}
		

	}

}
