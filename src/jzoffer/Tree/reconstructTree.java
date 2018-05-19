package Tree;

import java.util.ArrayList;

import Tree.TreeNode;

//����ĳ��������ǰ���������������Ľ�������ؽ����ö�����
public class reconstructTree {
	 
	public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root=reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
       return root;
   }
   //ǰ�����{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}
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
		//��¼���ڵ�
		if(pre.length!=0)
			root = new TreeNode(pre[0]);
		//����������
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
				//�ҵ���������ж�Ӧ�ĸ��ڵ㣬����������Ľڵ����
				leftSize = i;
				break;
			}
		}
		//��ʱ�ҵ���������ж�Ӧ�ĸ��ڵ�,��������Ϊ������
		for(int j=leftSize+1;j<in.length;j++){
			rightin.add(in[j]);
		}
		//����ǰ�������������
		for(int i=1;i<leftSize+1;i++){
			leftpre.add(pre[i]);
		}
		//����ǰ�������������
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
