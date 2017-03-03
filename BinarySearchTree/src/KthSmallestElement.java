import java.util.ArrayList;
import java.util.List;

public class KthSmallestElement {
	
	public int kthSmallest(TreeNode root, int k) {
		List<Integer> nodeList = new ArrayList<>(k);
		preOrderNodes(root,nodeList,k);
		return nodeList.get(k-1);
    }
	public void preOrderNodes(TreeNode treeNode,List<Integer> nodeList,int k)
	{
		if(treeNode == null)
		{
			return;
		}
		if(treeNode.left != null)
			preOrderNodes(treeNode.left,nodeList,k);
		if(nodeList.size() == k)
			return;
		nodeList.add(treeNode.val);
		if(treeNode.right != null)
			preOrderNodes(treeNode.right,nodeList,k);
		return;
	}
}
