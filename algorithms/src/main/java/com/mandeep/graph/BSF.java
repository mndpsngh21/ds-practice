package com.mandeep.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class BSF {

	
	/** 
	 * Basic graph
	 * @return
	 */
	public static BasicGraph createGraph() {
		BasicGraph graph= new BasicGraph();
		HashMap<Integer,Node> nodes =createNodes();
		 List<Node> nodesWithRelation=addRelation(nodes);
		 graph.setNodes(nodesWithRelation);
		return graph;
	}
	
	
	public static void addLinks(int node, int[] adjacents,HashMap<Integer,Node> values) {
		Node n=values.get(node);
		for(int value: adjacents) {
			Node valNode=values.get(value);
			n.getAdjacents().add(valNode);
			valNode.getAdjacents().add(n);
		}
	}
	
	public static List<Node> addRelation(HashMap<Integer,Node> map){
		 ArrayList<Node> node = new ArrayList<Node>();
		 addLinks(1, new int[]{2,4,5}, map);
		 addLinks(2, new int[]{3}, map);
		 addLinks(3, new int[]{5,7}, map);
		 addLinks(4, new int[]{5,8}, map);
		 addLinks(5, new int[]{9}, map);
		 addLinks(6, new int[]{8,9,10}, map);
		 addLinks(7, new int[]{11}, map);
		 addLinks(9, new int[]{11}, map);
		 addLinks(10, new int[]{11}, map);
		 int i=0;
		 Set<Integer> keySet= map.keySet();
		 for(Integer key:keySet) {
			 node.add(map.get(key));
		 }
		 return node;
	}
	
	public static HashMap<Integer,Node> createNodes(){
		
		HashMap<Integer,Node> nodes= new HashMap<Integer,Node>();
		for(int i=1;i<12;i++) {
			nodes.put(i,createNode(i));
		}
		return nodes;
		
	}
	
	
	
	public static Node createNode(int value) {
		Node n= new Node(value);
		return n;
	}
	
	public static boolean bsfSearch(BasicGraph g, Node start, Node end) {
		System.out.println("Start point :: "+start.getValue());
		System.out.println("Started looking for "+end.getValue());
		if(start==end) {
			return true;
		}

		LinkedList<Node> q= new LinkedList<Node>();
		q.add(start);
		start.setVisited(true);
		
		while(!q.isEmpty()) {
			Node next =q.removeFirst();
			System.out.println("Checking "+next.getValue());
			if(next!=null) {
				for(Node n:next.getAdjacents()) {
					if(!n.isVisited())
					{
						if(n==end) {
							System.out.println("Found "+n.getValue());
							return true;
						}
						else {
							q.add(n);
							System.out.print("Adding to queue "+n.getValue()+" , ");
						}
					}
				}
				
			}
			System.out.println();
			next.setVisited(true);
		}
		
		
		
		return false;
	}
	
	
	
	public static boolean dfSearch(BasicGraph g, Node start, Node end) {
		if(start==end) {
			return true;
		}
		
		Stack<Node> stack= new Stack<Node>();
		stack.push(start);
		
		while(!stack.isEmpty()) {
			Node n =  stack.pop();
			System.out.println("Checking "+n.getValue());
			for(Node adj:  n.getAdjacents()) {
				if(!adj.isVisited()) {
					if(adj==end) {
						System.out.println("Found "+adj.getValue());
						return true;
					}
					else {
						stack.push(adj);
						System.out.print("Adding to queue "+adj.getValue()+" , ");
					}
				}
			}
			System.out.println();
			n.setVisited(true);
		}
		return false;
	}
	
	public static void main(String[] args) {
		BasicGraph graph=	createGraph();
		boolean status=bsfSearch(graph, graph.getNodes().get(0), graph.getNodes().get(10));
		System.out.println(status);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		BasicGraph graph2=	createGraph();
		boolean statusdfs=dfSearch(graph2, graph2.getNodes().get(0), graph2.getNodes().get(10));
		System.out.println(statusdfs);
	}
	
}
