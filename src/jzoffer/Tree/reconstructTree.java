package Tree;

import java.util.ArrayList;

import Tree.TreeNode;

//输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
public class reconstructTree {
	 
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
       return root;
   }
   //前序遍历{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
   private TreeNode reConstructBinaryTree(int [] pre,int startPre,int endPre,int [] in,int startIn,int endIn) {
         
       if(startPre>endPre||startIn>endIn)
           return null;
       TreeNode root=new TreeNode(pre[startPre]);
         
       for(int i=startIn;i<=endIn;i++)
           if(in[i]==pre[startPre]){
               root.left=reConstructBinaryTree(pre,startPre+1,startPre+i-startIn,in,startIn,i-1);
               root.right=reConstructBinaryTree(pre,i-startIn+startPre+1,endPre,in,i+1,endIn);
           }
                 
       return root;
   }
	
	/*
	public TreeNode reContruct(int[] pre,int[] in){
		TreeNode root = null;
		//记录根节点
		if(pre.length!=0)
			root = new TreeNode(pre[0]);
		//保存左子树
		ArrayList<Integer> leftin = new ArrayList<>();
		ArrayList<Integer> rightin = new ArrayList<>();
		ArrayList<Integer> leftpre = new ArrayList<>();
		ArrayList<Integer> rightpre = new ArrayList<>();
		int leftSize = 0;
		for(int i=0;i<in.length;i++){
			if(in[i]!=pre[0]){
				leftin.add(in[i]);
			}
			else{
				//找到中序遍历中对应的根节点，标记左子树的节点个数
				leftSize = i;
				break;
			}
		}
		//此时找到中序遍历中对应的根节点,保存后面的为右子树
		for(int j=leftSize+1;j<in.length;j++){
			rightin.add(in[j]);
		}
		//保存前序遍历的左子树
		for(int i=1;i<leftSize+1;i++){
			leftpre.add(pre[i]);
		}
		//保存前序遍历的右子树
		for(int j=leftSize+1;j<pre.length;j++){
			rightpre.add(pre[j]);
		}
//		Integer[] LeftPre1 = (Integer[]) leftpre.toArray(new Integer[leftSize]);
//		Integer[] LeftIn1 = (Integer[]) leftin.toArray(new Integer[leftSize]);
		int[] LeftPre = new int[leftpre.size()];
		int[] LeftIn = new int[leftin.size()];
		for(int i=0;i<leftpre.size();i++)
			LeftPre[i] = leftpre.get(i);
		for(int i=0;i<leftin.size();i++)
			LeftIn[i] = leftin.get(i);
		
		int[] RightPre = new int[rightpre.size()];
		int[] RightIn = new int[rightin.size()];
		for(int i=0;i<rightpre.size();i++)
			RightPre[i] = rightpre.get(i);
		for(int i=0;i<rightin.size();i++)
			RightIn[i] = rightin.get(i);
		
		
		root.left = reContruct(LeftPre, LeftIn);
		root.right = reContruct(RightPre, RightIn);
		
		
		return root;
	}
	
	public TreeNode reConstructBinaryTree(int[] pre,int[] in){
		if(pre == null || in == null || pre.length != in.length) 
            return null;
		TreeNode treeNode = reContruct(pre, in);
		return treeNode;
	}
	*/
	
	 private void printTree(TreeNode root) {
         if(root != null) {
        	 
             printTree(root.left);
             System.out.println(root.val + " ");
             printTree(root.right);
         }
     }
	
	public static void main(String[] args){
		reconstructTree r = new reconstructTree();
		int[] pre = {1, 2, 3,4,5,6,7};
	    int[] in = {3,2,4,1,6,5,7};
	    TreeNode node = r.reConstructBinaryTree(pre, in);
	    r.printTree(node);
	}

}
