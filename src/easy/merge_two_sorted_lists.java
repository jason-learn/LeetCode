package easy;

//21. Merge Two Sorted Lists
public class merge_two_sorted_lists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode newList = new ListNode(-1);
		ListNode cur = newList;
		if(l1==null)
			return l2;
		if(l2==null)
			return l1;
		while(l1!=null && l2!=null){
			if(l1.val >l2.val){
				cur.next = l2;
				l2 = l2.next;
			}
			else{
				cur.next = l1;
				l1 = l1.next;
			}
			cur = cur.next;
		}
		if(l1==null){
			cur.next = l2;
		}
		if(l2==null){
			cur.next = l1;
		}
		 
        
		return newList.next;
    }

	public static void main(String[] args) {
		 ListNode l11 = new ListNode(1);
		 ListNode l12 = new ListNode(2);
		 ListNode l13 = new ListNode(4);
		 ListNode l21 = new ListNode(1);
		 ListNode l22 = new ListNode(3);
		 ListNode l23 = new ListNode(4);
		 l11.next = l12;
		 l12.next = l13;
		 l21.next = l22;
		 l22.next = l23;
		 
		 merge_two_sorted_lists m = new merge_two_sorted_lists();
		 ListNode newL = m.mergeTwoLists(l11, l21);
		 System.out.println(newL.next.next.val);

	}

}
