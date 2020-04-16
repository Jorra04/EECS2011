/***********************************
* File name: LinkedList.java
* Author: Singh, Jorra
* Student ID: 215709876
* EECS login ID: jorra04
************************************/

public class LinkedList
{
	public class Node
	{
		private int data;
		private Node next;
		
		// Constructor
		public Node( int d )
		{
			data = d;
			next = null;
		}  // end constructor Node
	}  // end class Node
		
	private Node head;	// head of linked list
	
	// Constructor
	public LinkedList( )
	{
		head = null;
	}  // end constructor LinkedList
	
	public void insert( int d )
	{
		Node p = new Node( d );
		if ( head != null )
			p.next = head;
		head = p;			
	}  // end insert
	
	public void printList( )
	{
		Node p = head;
		while( p != null )
		{
			System.out.print( p.data + " " );
			p = p.next;
		}  // end while
		System.out.println( );
	}
	
	
	/**************************************************************
 	* DO NOT ADD ANYTHING ABOVE THIS LINE EXCEPT YOUR STUDENT INFO
 	***************************************************************/
 	
 	/*
 	 * Returns the number of times integer k appears in the linked list.  
 	 * Returns 0 if the linked list does not contain integer k or is empty.
 	 * Add a brief description of how your algorithm works below.
     */
     
    /* Brief description: ....................................
		the method borrows the idea from the iterative approach of traversing a linked list.
		
		the original function numOfTimes instantiates a current node that points to the head.
		We also create a variable counter which increments when there is a match found.
		
		We call numTimesHelper which checks first if the current node is null. if yes, return and break.
		else, we check if the data stored in the node is equal to the value given. if yes, we increment.
		
		we then make a recursive call while incrementing our current pointer to the next node in 
		the linked list and start again.
 	 */
 	 
	public int numOfTimes( int k )
	{
   		// COMPLETE THIS METHOD.

   		// DO NOT CHANGE the above method declaration.

   		// You may define local variables inside this method.  Do not use global variables.

   		// You may add your own helper methods/subroutines to this file.
		int counter = 0;
		Node curr = head;
   		return numTimesHelper(curr, counter, k);	// replace this line with your code
	}  // end numOfTimes
	
	public int numTimesHelper(Node curr, int counter, int val) {
		if(curr == null) {
			return counter;
		}
		if(curr.data == val) {
			counter ++;
		}
		return numTimesHelper(curr.next, counter, val);
	}
	
}  // end class LinkedList
