package com.mandeep.heap;

/**
 * 
 * @author mandeep
 *  
 */
public class MinHeap {
	
	 private int[] Heap;
	    private int size;
	    private int maxsize;
	    
	
	 public MinHeap(int maxsize)
	    {
	        // This keyword refers to current instance itself
	        this.maxsize = maxsize;
	        this.size = 0;
	        Heap = new int[this.maxsize];
	    }
	

	 public int parentNodePosition(int pos) {
		 return (pos-1)/2;
	 }
	 
	 public int leftChildPosition(int pos) {
		 return (pos*2)+1;
	 }

	 public int rightChildPosition(int pos) {
		 return (pos*2)+2;
	 }
	 
	 
	 public void swap(int pos1, int pos2) {
		 int temp=Heap[pos1];
		 Heap[pos1]=Heap[pos2];
		 Heap[pos2]=temp;
	 }
	 
	
	
//	Step 1 − Create a new node at the end of heap.
//	Step 2 − Assign new value to the node.
//	Step 3 − Compare the value of this child node with its parent.
//	Step 4 − If value of parent is less than child, then swap them.
//	Step 5 − Repeat step 3 & 4 until Heap property holds.
	  public void addToHeap(int value) {
		  // step 1 and step 2
		  int current= size;
		  Heap[current]=value;
		  System.out.println("Inserted "+Heap[current]+"  AT "+current);
		  // Step 3 
		  while(Heap[current]<Heap[parentNodePosition(current)]) {
			  System.out.println("Swapping "+Heap[current]+"  with "+Heap[parentNodePosition(current)]);
			  System.out.println("Position swapping "+current+" <=> "+parentNodePosition(current));
			  // Step 4
			  swap(current, parentNodePosition(current));
			  current= parentNodePosition(current);
		  }
		  size++;
	  }
	
	  
	  public void printMaxValue() {
		  System.out.println("Maxium value in Heap :: "+Heap[0]);
    		System.out.println(" ");	

	  }
	  
	  
	  /**
	   *  if postion is leaf Node return, base case for recursion
	   * 
	   * 
	   */
	  
	  public void heapify(int pos) {
		  System.out.println("postion :: "+pos);
		  if(isLeafNode(pos)) {
			  return ;
		  }
		  
		  // if value of left child or right child are less then only we will perform heapificaton
		  
		  if(Heap[pos]>Heap[leftChildPosition(pos)] || Heap[pos]>Heap[rightChildPosition(pos)]) {
			  if(Heap[leftChildPosition(pos)]<Heap[rightChildPosition(pos)]) {
				  swap(pos, leftChildPosition(pos));
				  print();
				  heapify(leftChildPosition(pos));
			  }
			  
			  else {
				  swap(pos, rightChildPosition(pos));
				  print();
				  
				  heapify(rightChildPosition(pos));
			  }
			  
		  }
		  
		  
	  }
	  
	  /**
	   * A node is leaf node if it does not have any child
	   * 
	   * @param pos
	   * @return
	   */
	  private boolean isLeafNode(int pos) {
		  // for only values less then half position will be checked
		  if (pos > (size / 2) && pos <= size) {
	            return true;
	        }
	        return false;
	}


	/**
	   * Steps to remove from maxHeap
	   * 
	   *  1. replace node with last node
	   *  2. perform heapify Method
	   * 
	   * @param index
	   */
	  public void remove(int index) {
		  if(index>size) {
			  return;
		  }
		  
		  Heap[index]=Heap[--size];
		  System.out.println("");
		  System.out.println("");
		  System.out.println("");
		  System.out.println("****************    Started Heapify *****************************");
		  heapify(index);
		  
	  }
	  
	
	   public void print()
	    {
		   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
			   
	      for(int i=0;i<size;i++){
	 
	            System.out.print("Parent Node : " + Heap[i] );
	            System.out.println("");
	             
	            if(leftChildPosition(i)<size) //if the child is out of the bound of the array
	               System.out.print( " Left Child Node: " + Heap[leftChildPosition(i)]);
	             
	            if(rightChildPosition(i)<size) //if the right child index must not be out of the index of the array
	                System.out.print(" Right Child Node: "+ Heap[rightChildPosition(i)]);
	             
	                System.out.println(); //for new line
	             
	        }
	      System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
	  	  
	    }
	
	public static void main(String[] args) {
		
		MinHeap maxHeap = new MinHeap(20);
		
		maxHeap.addToHeap(12);
		maxHeap.printMaxValue();
		maxHeap.addToHeap(34);
		maxHeap.printMaxValue();
		maxHeap.addToHeap(50);
		maxHeap.printMaxValue();
		maxHeap.addToHeap(17);
		maxHeap.printMaxValue();

		maxHeap.addToHeap(42);
		maxHeap.printMaxValue();

		maxHeap.addToHeap(58);
		maxHeap.printMaxValue();
		
		maxHeap.addToHeap(48);
		maxHeap.printMaxValue();
		
		maxHeap.addToHeap(5);
		maxHeap.addToHeap(8);
		maxHeap.addToHeap(11);
		maxHeap.addToHeap(14);

		maxHeap.printMaxValue();
     	maxHeap.print();
    	
     //   maxHeap.remove(1);
		maxHeap.print();
		
	}
	
	
	

}
