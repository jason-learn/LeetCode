package easy;


//111. Minimum Depth of Binary Tree  µÝ¹é½â·¨
public class MinimumDepthofBinaryTree {
	public int run(TreeNode root){
		int MinDepth = getMinDepth(root);
		return MinDepth;
	}
	public int getMinDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		if(root.left==null){
			return getMinDepth(root.right)+1;
		}
		if(root.right==null){
			return getMinDepth(root.left)+1;
		}
		return Math.min(getMinDepth(root.left), getMinDepth(root.right))+1;
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode t1= new TreeNode(1);
		TreeNode t2 = new TreeNode(1);
		root.left = t1;
		t1.right = t2;
		MinimumDepthofBinaryTree m = new MinimumDepthofBinaryTree();
		System.out.println(m.run(root));
		 
		

	}

}
