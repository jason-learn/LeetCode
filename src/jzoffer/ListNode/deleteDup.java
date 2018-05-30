package ListNode;

//删除链表中重复的节点
public class deleteDup {
	
	public ListNode deleteDuplication(ListNode pHead){
		 
		ListNode temp = pHead; //这是遍历的当前链表
		ListNode pre = new ListNode(1);//这是结果链表，处于temp前
		pre.next = pHead;
		ListNode result = pre;  //结果链表的头节点
		while(temp!=null){
			//处理temp为重复值的情况
			if(temp.next!=null && temp.val==temp.next.val){
				//
				 while(temp.next!=null &&temp.val==temp.next.val){
					 temp = temp.next;
				 }
				 temp = temp.next; //移动当前链表
				 pre.next = temp;  //移动结果链表
			}
			else{
				pre = pre.next;
				temp = temp.next;
			}
		}
		
		
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
