package ListNode;

//ɾ���������ظ��Ľڵ�
public class deleteDup {
	
	public ListNode deleteDuplication(ListNode pHead){
		 
		ListNode temp = pHead; //���Ǳ����ĵ�ǰ����
		ListNode pre = new ListNode(1);//���ǽ����������tempǰ
		pre.next = pHead;
		ListNode result = pre;  //��������ͷ�ڵ�
		while(temp!=null){
			//����tempΪ�ظ�ֵ�����
			if(temp.next!=null && temp.val==temp.next.val){
				//
				 while(temp.next!=null &&temp.val==temp.next.val){
					 temp = temp.next;
				 }
				 temp = temp.next; //�ƶ���ǰ����
				 pre.next = temp;  //�ƶ��������
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
