package easy;

//83. Remove Duplicates from Sorted List
public class RemoveDuplicatesfromSortedList {
	public ListNode deleteDuplicates(ListNode head){
		if(head==null) return head;
		ListNode node = head;
		 
		while(node.next!=null){
			if(node.next.next!=null){
				if(node.val==node.next.val)
					node.next = node.next.next;
				else node = node.next;
			}
			else{
				if(node.val==node.next.val){
					node.next=null;
				}
				else node = node.next;
			}
			
					 
		}
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicatesfromSortedList r = new RemoveDuplicatesfromSortedList();
		ListNode head = new ListNode(1);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(3);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		
		System.out.print(r.deleteDuplicates(head).next.val);

	}

}
