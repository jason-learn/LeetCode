package easy;

//100. Same Tree
public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean isSame = true;
		if(p==null & q==null) isSame=true;
		else if(p==null & q!=null) isSame=false;
		else if(p!=null & q==null) isSame=false;
		//递归，该节点值相同且左子树和右子树
		else isSame=p.val==q.val & isSameTree(p.left,q.left) & isSameTree(p.right,q.right);
		return isSame;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
