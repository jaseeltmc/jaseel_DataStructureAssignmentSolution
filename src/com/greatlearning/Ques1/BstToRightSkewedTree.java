package com.greatlearning.Ques1;

public class BstToRightSkewedTree {
	public Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void convertBstToRightSkewedTree(Node root) {

		if (root == null) {
			return;
		}

		convertBstToRightSkewedTree(root.left);

		Node rightNode = root.right;

		
		if (headNode == null) {
			headNode = root;
			root.left = null;
			prevNode = root;
		} else {
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}

		
		convertBstToRightSkewedTree(rightNode);
	}

	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.value + " ");
		traverseRightSkewedTree(root.right);
	}

}
