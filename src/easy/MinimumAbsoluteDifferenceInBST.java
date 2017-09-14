package easy;

//530. Minimum Absolute Difference in BST
public class MinimumAbsoluteDifferenceInBST {
	int minDiff = Integer.MAX_VALUE;
    TreeNode prev;
    
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) minDiff = Math.min(minDiff, root.val - prev.val);
        prev = root;
        inorder(root.right);
    }
	
	public static void main(String []args){
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(2);
		root.right = t1;
		t1.left = t2;
		MinimumAbsoluteDifferenceInBST m = new MinimumAbsoluteDifferenceInBST();
		System.out.println(m.getMinimumDifference(root));
		
	}

}
