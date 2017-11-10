package easy;

// 404. Sum of Left Leaves
public class SumofLeftLeaves {
	public int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		 
		int sumleft=0;
		//左子树的左节点值和
		if(root.left!=null){
			//左子树是叶子节点
			if((root.left.left==null)&(root.left.right==null))sumleft+=root.left.val;	
			//左子树不是叶子节点
			else sumleft+=sumOfLeftLeaves(root.left);
			
		}
		//右子树的左节点值和
		if(root.right!=null){
			int right=sumOfLeftLeaves(root.right);
			sumleft+=right;
		}
		return sumleft;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=new TreeNode(3);
		TreeNode t1=new TreeNode(9);
		TreeNode t2=new TreeNode(20);
		TreeNode t3=new TreeNode(15);
		TreeNode t4=new TreeNode(7);
		root.left=t1;
		root.right=t2;
		t2.left=t3;
		t2.right=t4;
		SumofLeftLeaves s = new SumofLeftLeaves();
		System.out.println(s.sumOfLeftLeaves(root));
		

	}

}
