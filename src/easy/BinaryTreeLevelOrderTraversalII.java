package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//107. Binary Tree Level Order Traversal II
public class BinaryTreeLevelOrderTraversalII {
	public List<List<Integer>> leverOrderBottom(TreeNode root){
		LinkedList<List<Integer>> list = new LinkedList<List<Integer>>();
		add(list, 0, root);
		return list;
	}
	//addFirst() method of LinkedLinked save us from reverse final result.
	public void add(LinkedList<List<Integer>> list, int level, TreeNode node){
		if (node == null) return;
		if (list.size()-1 < level) list.addFirst(new LinkedList<Integer>());
		list.get(list.size()-1-level).add(node.val);
		add(list, level+1, node.left); //添加左子树
		add(list, level+1, node.right);//添加右子树
		
	}
	
	//使用队列，每出一个节点，进它的左右子节点
	public List<List<Integer>> levelOrderBottom2(TreeNode root) {

	    List<List<Integer>> result = new ArrayList<List<Integer>>();
	    if(root==null) return result;
	    Queue<TreeNode> q = new LinkedList();
	    q.add(root);
	    //当队列不为空
	    while(q.size()>0){
	        List<Integer> list = new ArrayList<>();
	        int size = q.size();
	        //队列中元素出队列
	        for(int i=0; i<size; i++){
	        	//出队列
	            TreeNode node = q.poll();
	            //添加到list中
	            list.add(node.val);
	            //将左右子节点加入队列中
	            if(node.left!=null) q.add(node.left);
	            if(node.right!=null) q.add(node.right);
	        }
	        result.add(0,list);
	    }
	    return result;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(2);
		root.right = t1;
		t1.left = t2;
		BinaryTreeLevelOrderTraversalII b = new BinaryTreeLevelOrderTraversalII();
		System.out.println(b.leverOrderBottom(root));

	}

}
