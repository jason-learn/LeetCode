package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import medium.TreeNode;

//94. Binary Tree Inorder Traversal
public class BinaryTreeInorderTraversal {
	//一种迭代的方法，利用栈
	public List<Integer> inorderTraversal(TreeNode root){
		//定义输出节点的列表
		 List<Integer> list = new ArrayList<Integer>();
		 //用来中序遍历存储根节点的栈
		 Stack<TreeNode> stack = new Stack<TreeNode>();
		 TreeNode cur = root;
		 while(cur!=null || !stack.isEmpty()){
			 while(cur!=null){
				 stack.add(cur);
				 cur = cur.left;
			 }
			 //输出根的值
			 cur = stack.pop();
		     list.add(cur.val);
		     cur = cur.right;
		 }
		 return list;
		 
	}
	//一种递归的方式
	public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> io = new LinkedList<Integer>();
        inOrder(root, io);
        return io;
    }
    
    public void inOrder(TreeNode root, List<Integer> io){
        if(root == null) return;
        
        inOrder(root.left, io);
        io.add(root.val);
        inOrder(root.right, io);


    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		root.right = t1;
		t1.left = t2;
		System.out.println(b.inorderTraversal2(root));

	}

}
