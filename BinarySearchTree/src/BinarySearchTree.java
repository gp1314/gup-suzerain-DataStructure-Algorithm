
public class BinarySearchTree {
	
	public TreeNode root;
	public void buidTree(int[] intNodes)
	{
		for(int i:intNodes)
		{
			addNode(root, i);
		}
	}
	public void addNode(TreeNode tree,int intNode)
	{
		if(tree == null)
		{
			tree = new TreeNode(intNode);
			root = tree;
		}
		if(intNode < tree.val)
		{
			if(tree.left == null)
				tree.left = new TreeNode(intNode);
			else
				addNode(tree.left, intNode);
		}
		else if(intNode > tree.val)
		{
			if(tree.right == null)
				tree.right = new TreeNode(intNode);
			else
				addNode(tree.right, intNode);
		}
		else
			return;
	}
	public void preOrderScan(TreeNode treeNode)
	{
		if(treeNode == null)
		{
			return;
		}
		if(treeNode.left != null)
			preOrderScan(treeNode.left);
		System.out.println(treeNode.val);
		if(treeNode.right != null)
			preOrderScan(treeNode.right);
	}
	public TreeNode getTree()
	{
		return root;
	}
	
}
