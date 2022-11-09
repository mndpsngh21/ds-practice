package com.mandeep.graph;

import java.util.ArrayList;

public class Node {

	private int value;
	ArrayList<Node> adjacents = new ArrayList<Node>();

    boolean isVisited;
	
	
	public Node(int value) {
		this.value=value;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public ArrayList<Node> getAdjacents() {
		return adjacents;
	}


	public void setAdjacents(ArrayList<Node> adjacents) {
		this.adjacents = adjacents;
	}


	public boolean isVisited() {
		return isVisited;
	}


	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	
	
	
}
