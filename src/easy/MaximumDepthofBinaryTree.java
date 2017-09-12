package easy;
import easy.TreeNode;
import java.util.*;

//104. Maximum Depth of Binary Tree
 

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if(root==null){
			return 0;
		}
		root.val = 1;
		queue.add(root);
		int depth =0;
		while(!queue.isEmpty()){
			TreeNode temp;
			temp = queue.poll();
			//����ǰ���е�һ���ڵ�������Ϊ�������
			if(temp.val>depth){
				depth = temp.val;
			}
			//������е�һ���ڵ㻹���ӽڵ㣬����ӽ�����
			if(temp.left!=null){
				temp.left.val = temp.val+1;
				queue.add(temp.left);
			}
			if(temp.right!=null){
				temp.right.val = temp.val+1;
				queue.add(temp.right);
			}
		}
		
		return depth;
        
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(0);
		TreeNode left = new TreeNode(3);
		TreeNode right = new TreeNode(3);
		root.left = left;
		left.right = right;
		MaximumDepthofBinaryTree maximumDepthofBinaryTree = new MaximumDepthofBinaryTree();
		int depth=maximumDepthofBinaryTree.maxDepth(root);
		System.out.println(depth);

	}

}
