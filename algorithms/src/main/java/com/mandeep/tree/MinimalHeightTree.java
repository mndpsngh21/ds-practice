package com.mandeep.tree;

import java.io.PrintStream;

public class MinimalHeightTree {
	
	
	
	public static void main(String[] args) {
		int[] arr = {1,5,9,11,14,15,18,31,45};
		TreeNode root= creatMinimalTree(arr);
		System.out.println("Root Node :: "+root.data);
		//printLeafNodes(root);
		print(System.out, root);
	}
	

	public static TreeNode creatMinimalTree(int[] arr) {
		return generateMinHeightTree(arr,0,arr.length-1);
	}


	private static TreeNode generateMinHeightTree(int[] arr, int left, int right) {
		
		if(right<left) {
			return null;
		}
		
		int mid= (left+right)/2;
		// find node from mid
		TreeNode node=new TreeNode(arr[mid]);
		// check recursively for left node
		node.left= generateMinHeightTree(arr, left, mid-1);
		// check recursively for right node
		node.right= generateMinHeightTree(arr, mid+1, right);
		return node;
	}
	
	public static void printLeafNodes(TreeNode node) { // base case 
		if (node == null) {
			return;
		}
		if (node.left == null && node.right == null) 
		{
			System.out.printf("%d ", node.data); 
		} 
		printLeafNodes(node.left); 
		printLeafNodes(node.right); 
	}

	public static void traversePreOrder(StringBuilder sb, String padding, String pointer, TreeNode node) {
	    if (node != null) {
	        sb.append(padding);
	        sb.append(pointer);
	        sb.append(node.getData());
	        sb.append("\n");

	       // System.out.println(sb.toString());
	        StringBuilder paddingBuilder = new StringBuilder(padding);
	        paddingBuilder.append("│  ");

	        String paddingForBoth = paddingBuilder.toString();
	        String pointerForRight = "└──";
	        String pointerForLeft = (node.getRight() != null) ? "├──" : "└──";
	        
	        traversePreOrder(sb, paddingForBoth, pointerForLeft, node.getLeft());
	        traversePreOrder(sb, paddingForBoth, pointerForRight, node.getRight());
	    }
	}
	
	public static void print(PrintStream os,TreeNode node) {
	    StringBuilder sb = new StringBuilder();
	    traversePreOrder(sb,"","",node);
	    os.print(sb.toString());
	}

		

}
