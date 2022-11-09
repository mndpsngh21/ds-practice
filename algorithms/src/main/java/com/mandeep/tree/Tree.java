package com.mandeep.tree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Tree {
	
	class Node{
		int data;
		Node left;
		Node right;
		
		public Node(int data) {
			this.data=data;
		}
		
	}
	
    static void buildTree(Node root) throws NumberFormatException, IOException {
    	Scanner sc = new Scanner(System.in);
    	int input=sc.nextInt();
    	Tree t= new Tree();
    	while(input>=0) {
    		Node node = t.new Node(input);
    		insertIntoTree(root,node);
    		input=sc.nextInt();
    	}
    	
    	sc.close();
    }
	
	
	private static void insertIntoTree(Node root,Node node) {
		
		if(root.data>node.data) {
			if(root.left==null) {
				root.left=node;
				return;
			}
			insertIntoTree(root.left, node);
		}
		else {
			if(root.right==null) {
				root.right=node;
				return;
			}
			insertIntoTree(root.right, node);			
		}
	}

	 public static ArrayList<Integer> duplicates(int arr[], int n) {
		 ArrayList<Integer> duplicatesValues= new ArrayList<Integer>();   
	       HashSet<Integer> duplicates = new HashSet<Integer>();
	     
	       for(int i=0;i<arr.length;i++){
	           if(duplicates.contains(arr[i])) {
	        	   if(!duplicatesValues.contains(arr[i])) {
		        	   duplicatesValues.add(arr[i]);	        		   
	        	   }
	           }
	           else {
	        	   duplicates.add(arr[i]);
	           }
	       }
	       
	       if(duplicatesValues.size()==0) {
	    	   duplicatesValues.add(-1);
	       }
	       
	       Collections.sort(duplicatesValues);
	        return duplicatesValues;
	    }


	public static void main(String[] args) {
		
		Tree t= new Tree();
		Node root = t.new Node(10);
		try {
			buildTree(root);
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	

}
