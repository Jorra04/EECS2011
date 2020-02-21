package Q2;

import Q2.DNode;
import Q2.EmptyDequeException;

/***********************************
* EECS2011 - Assignment 3
* File name: ListDeque.java
* Author: Last name, first name
* Email: Your email address
* EECS username: Your EECS login ID
************************************/


public class ListDeque 
{

   protected DNode header, trailer;  // dummy nodes

   protected int size;    // number of elements

   public ListDeque()     // constructor: initialize an empty deque
   {
      header = new DNode( 0, null, null );
      trailer = new DNode( 0, null, null );
      header.setNext(trailer);  // make header point to trailer
      trailer.setPrev(header);  // make trailer point to header
      size = 0;
   }


    /**
     * Display the content of the deque
     *
     */
    public void printDeque( )
    {
	for ( DNode p = header.getNext(); p != trailer; p = p.getNext() )
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

      return header.next.element;   // replace this line with your code       
    }


    /**
     * Returns the last element of the deque
     * 
     */
    public int getLast( ) throws EmptyDequeException
    {
    	// COMPLETE THIS METHOD   

      return trailer.prev.element;   // replace this line with your code         
    }


    /**
     * Inserts e at the beginning (as the first element) of the deque
     * 
     */
    public void insertFirst( int e )
    {
    	DNode node = new DNode(e,null,null);
		if(header.next == null ) {
			node.next = node.prev =null;
			header.next = node;
			trailer.next = header.next;
		}
		else {
			node.prev = null;
			node.next = header.next;
			header.next.prev = node;
			header.next = node;
		}
		this.size++;
    }


    /**
     * Inserts e at the end (as the last element) of the deque
     * 
     */
    public void insertLast( int e )
    {
    	DNode node = new DNode(e , null, null);
    	trailer.prev.next = node;
    	node.prev = trailer.prev;
    	node.next = trailer;
    	trailer.prev = node;
    	this.size++;
    }


    /**
     * Removes and returns the first element of the deque
     * 
     */
    public int removeFirst( ) throws EmptyDequeException
    {
    	int val = header.next.element;
    	if(this.size == 1) {
    		header.next = null;
    		trailer.prev = null;
    	}
    	else {
    		header.next.next.prev = header;
    		header.next = header.next.next;
    		
    	}
    	this.size --;
    	
    	
    	return val;
// replace this line with your code	
    }


    /**
     * Removes and returns the last element of the deque
     * 
     */
    public int removeLast( ) throws EmptyDequeException
    {
    	int val = trailer.prev.element;
    	if(this.size == 1) {
    		trailer.prev = null;
    		header.next = null;
    	}
    	else {
    		trailer.prev.prev.next = trailer;
    		trailer.prev = trailer.prev.prev;
    		this.size--;
    	}

      return val;   // replace this line with your code
    }


} // end class
