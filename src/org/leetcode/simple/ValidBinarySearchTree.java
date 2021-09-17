package org.leetcode.simple;

import org.leetcode.struct.TreeNode;

public class ValidBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
		
	}
	
	public boolean isValidBST(TreeNode node, long low, long upper) {
		if (node == null)
			return true;
		if (node.val <= low || node.val >= upper)
			return false;
		return isValidBST(node.left, low, node.val) && isValidBST(node.right, node.val, upper);
	}
	
	
	
	public static void main(String[] args) {
		TreeNode node3 = new TreeNode(3);
		TreeNode node7 = new TreeNode(7);
		TreeNode node6 = new TreeNode(6);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		
		node5.left = node4;
		node5.right = node6;
		node6.left = node3;
		node6.right = node7;
		ValidBinarySearchTree validTree = new ValidBinarySearchTree();
		System.out.println(validTree.isValidBST(node5));
	}
}
