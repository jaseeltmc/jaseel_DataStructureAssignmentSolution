package com.greatlearning.Ques1;

import static com.greatlearning.Ques1.BstToRightSkewedTree.*;

public class Main {
	
	public static void main(String[] args) {

		BstToRightSkewedTree transactionsTree = new BstToRightSkewedTree();


		transactionsTree.node = new Node(50);
		transactionsTree.node.left = new Node(30);
		transactionsTree.node.right = new Node(60);
		transactionsTree.node.left.left = new Node(10);
		transactionsTree.node.right.left = new Node(55);


		convertBstToRightSkewedTree(transactionsTree.node);
		System.out.println("The Transactions in ascending Order are : ");
		traverseRightSkewedTree(headNode);
	}

}
