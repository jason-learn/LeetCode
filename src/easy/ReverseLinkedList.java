package easy;

public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		/* iterative solution */
	    ListNode newHead = null;
	    while (head != null) {
	        ListNode next = head.next;
	        
	        head.next = newHead;
	        newHead = head;
	        
	        head = next;
	    }
	    return newHead;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
