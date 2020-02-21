package Q3;

import Q3.DNode;
import Q3.EmptyDequeException;

/***********************************
* EECS2011 - Assignment 3
* File name: AnotherListDeque.java
* Author: Last name, first name
* Email: Your email address
* EECS username: Your EECS login ID
************************************/


public class AnotherListDeque 
{

   protected DNode head, tail;  // head and tail contain actual data (int)

   protected int size;    // number of elements

   public AnotherListDeque()     // constructor: initialize an empty deque
   {
       head = tail = null;
       size = 0;
   }


    /**
     * Display the content of the deque
     *
     */
    public void printDeque( )
    {

	for ( DNode p = head; p != null; p = p.getNext() )
	    System.out.print( p.getElement() + " " );
	System.out.println();

    }


   // ***************************************
   // DO NOT MODIFY THE CODE ABOVE THIS LINE.
   // ADD YOUR CODE BELOW THIS LINE.
   //
   // ***************************************

   /**
     * Returns the number of items in this collection.
     * @return the number of items in this collection.
     */
    public int size( )
    {
        // COMPLETE THIS METHOD

      return this.size;   // replace this line with your code
    }


    /**
     * Returns true if this collection is empty.
     * @return true if this collection is empty.
     */ 
    public boolean isEmpty( )
    {
    	// COMPLETE THIS METHOD

      return this.size == 0;   // replace this line with your code
    }


    /**
     * Returns the first element of the deque
     * 
     */
    public int getFirst( ) throws EmptyDequeException
    {
    	// COMPLETE THIS METHOD     

      return head.element;   // replace this line with your code       
    }


    /**
     * Returns the last element of the deque
     * 
     */
    public int getLast( ) throws EmptyDequeException
    {
    	// COMPLETE THIS METHOD   

      return tail.element;   // replace this line with your code         
    }


    /**
     * Inserts e at the beginning (as the first element) of the deque
     * 
     */
    public void insertFirst( int e )
    {
    	DNode node = new DNode(e,null,null);
		if(head == null ) {
			node.next = node.prev =null;
			head = node;
			tail = head;
		}
		else {
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
		} 
		this.size++;
    }


    /**
     * Inserts e at the end (as the last element) of the deque
     * 
     */
    public void insertLast( int e )
    {
    	DNode node = new DNode(e,null,null);
		if(this.tail == null) {
			node.next = node.prev = null;
			tail = node;
		}
		else {
			node.prev = tail;
			tail.next = node;
			node.next = null;
			tail = node;
		}
		this.size++;
    }


    /**
     * Removes and returns the first element of the deque
     * 
     */
    public int removeFirst( ) throws EmptyDequeException
    {
    	int val = head.element;
    	if(this.size == 1) {
    		head.prev = null;
    		head.next = null;
    		tail.next = null;
    		tail.prev = null;
    	}
    	else {
    		head.next.prev = null;
    		head = head.next;
    	}
    	
      return val;   // replace this line with your code	
    }


    /**
     * Removes and returns the last element of the deque
     * 
     */
    public int removeLast( ) throws EmptyDequeException
    {
    	int val = tail.element;
    	if(this.size == 1) {
    		head.prev = null;
    		head.next = null;
    		tail.next = null;
    		tail.prev = null;
    	}
    	else {
    		tail.prev.next = null;
    		tail = tail.prev;
    	}

      return val;   // replace this line with your code
    }


} // end class
