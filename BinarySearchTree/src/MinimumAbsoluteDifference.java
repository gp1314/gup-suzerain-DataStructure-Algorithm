
public class MinimumAbsoluteDifference {
	/*
	 * Given a binary search tree with non-negative values, find the minimum absolute difference between values of any two nodes.

	Example:

	Input:

	   1
	    \
	     3
	    /
	   2

	Output:
	1

	Explanation:
	The minimum absolute difference is 1, which is the difference between 2 and 1 (or between 2 and 3).
	 * */
	public int getMinimumDifference(TreeNode root) {
		assert root != null;
		int minLeft = Integer.MAX_VALUE;
		int minRight = Integer.MAX_VALUE;
		if(root.left != null)
			minLeft = getMinimumDifference(root.left);
		if(root.right != null)
			minRight = getMinimumDifference(root.right);
		
		TreeNode clidTreeLeft = root;
		if(root.right != null)
			clidTreeLeft = getTreeLeftNode(root.right);
		
		TreeNode clidTreeRight = root;
		if(root.left != null)
			clidTreeRight = getTreeRightNode(root.left);
		int leftValue = clidTreeLeft == root?Integer.MAX_VALUE:(clidTreeLeft.val - root.val);
		int rightValue = clidTreeRight == root?Integer.MAX_VALUE:(root.val -clidTreeRight.val);
		int localMin = Integer.min(leftValue, rightValue);
		return localMin < Integer.min(minLeft, minRight) ? localMin : Integer.min(minLeft, minRight);
    }
	
	public TreeNode getTreeRightNode(TreeNode treeNode)
	{
		if(treeNode.right == null)
			return treeNode;
		else
			return getTreeRightNode(treeNode.right);
	}
	public TreeNode getTreeLeftNode(TreeNode treeNode)
	{
		if(treeNode == null)
			return null;
		if(treeNode.left == null)
			return treeNode;
		else
			return getTreeLeftNode(treeNode.left);
	}
}
