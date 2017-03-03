import java.util.Random;

import javax.xml.soap.Node;

public class Main {
	public static void main(String[] args)
	{
		Random random = new Random();
		int treeSize = random.nextInt(20);
		assert treeSize > 0;
		int[] intNodes = new int[treeSize];
		for(int i=0;i<treeSize;++i)
		{
			intNodes[i] = random.nextInt(1000);
		}
//		intNodes = new int[]{236,701,104,227,911};
		BinarySearchTree binarySearchTree = new BinarySearchTree();
		binarySearchTree.buidTree(intNodes);
		binarySearchTree.preOrderScan(binarySearchTree.getTree());
		/*MinimumAbsoluteDifference solution = new MinimumAbsoluteDifference();
		System.out.println(solution.getMinimumDifference(binarySearchTree.getTree()));*/
		KthSmallestElement kthSmallestElement = new KthSmallestElement();
		int index = random.nextInt(treeSize);
		assert index > 0;
		System.out.println("index: "+index);
		System.out.println(kthSmallestElement.kthSmallest(binarySearchTree.getTree(), index));
		
	}

}
