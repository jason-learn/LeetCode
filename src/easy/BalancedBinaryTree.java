package easy;

//110. Balanced Binary Tree
public class BalancedBinaryTree {
	//�ҳ��������
	public int Height(TreeNode root){
		if(root==null)
			return 0;
		int h = Math.max(Height(root.left), Height(root.right));
		return 1+h;
	}
	//�ж��Ƿ���ƽ��ģ���ÿ���ڵ��������������ȵĲ�ľ���ֵ�Ƿ�=1
	public boolean isBalanced(TreeNode root){
		if(root==null)
			return true;
		if(Math.abs(Height(root.left)-Height(root.right))>1)
			return false;
		return isBalanced(root.left)&&isBalanced(root.right);
	}
	

	public static void main(String[] args) {
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		BalancedBinaryTree b = new BalancedBinaryTree();
		System.out.println(b.isBalanced(t1));
		

	}

}
