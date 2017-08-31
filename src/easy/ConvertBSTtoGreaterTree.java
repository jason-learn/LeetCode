package easy;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //538. Convert BST to Greater Tree
//递归求节点的值addsum！！！！！！！！！！！！！！！！！！！！！！！！！！！！！

public class ConvertBSTtoGreaterTree {
	 public TreeNode convertBST(TreeNode root) {		 
		 addsum(root);		 
		 return root;	        
	    }
	 int sum =0;
	 public void addsum(TreeNode root){
		 if(root!=null){
			 addsum(root.right);
			 sum+= root.val;
			 root.val=sum;
			 addsum(root.left);
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(7);
		TreeNode node1 = new TreeNode(5); 
		TreeNode node2 = new TreeNode(2); 
		TreeNode node3 = new TreeNode(6); 
		TreeNode node4 = new TreeNode(13); 
		root.left = node1;
		root.right = node4;
		node1.left = node2;
		node1.right = node3;
		ConvertBSTtoGreaterTree convertBSTtoGreaterTree = new ConvertBSTtoGreaterTree();
		root = convertBSTtoGreaterTree.convertBST(root);
		System.out.println(root.val);
		System.out.println(root.left.val);

	}

}
