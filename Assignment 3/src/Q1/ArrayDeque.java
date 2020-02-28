package Q1;

import java.util.Arrays;

/***********************************
* EECS2011 - Assignment 3
* File name: ArrayDeque.java
* Author: Last name, first name
* Email: Your email address
* EECS username: Your EECS login ID
************************************/


public class ArrayDeque {
	public static final int INIT_CAPACITY = 8; // initial array capacity
	protected int capacity; // current capacity of the array
	protected int front; // index of the front element
	protected int rear; // index of the rear element
	protected int[] A; // array deque

	public ArrayDeque() // constructor method
	{
		A = new int[INIT_CAPACITY];
		capacity = INIT_CAPACITY;
		front = rear = 0;
	}

	/**
	 * Display the content of the deque
	 * 
	 */
	public void printDeque() {
		for (int i = front; i != rear; i = (i + 1) % capacity)
			System.out.print(A[i] + " ");
		System.out.println();
	}

	/**
	 * Display the content of the whole array
	 *
	 */
	public void printArray() {
		for (int i = 0; i < capacity; i++)
			System.out.print(A[i] + " ");
		System.out.println();
	}

	// ***************************************
	// DO NOT MODIFY THE CODE ABOVE THIS LINE.
	// ADD YOUR CODE BELOW THIS LINE.
	//
	// ***************************************

	/**
	 * Returns the number of items in this collection.
	 * 
	 * @return the number of items in this collection.
	 */
	public int size() {
		// COMPLETE THIS METHOD

		// Hint: size can be computed from capacity, front and rear.

		return (capacity - front + rear)%capacity; // replace this line with your code
	}

	/**
	 * Returns true if this collection is empty.
	 * 
	 * @return true if this collection is empty.
	 */
	public boolean isEmpty() {
		// COMPLETE THIS METHOD

		return front == rear; // replace this line with your code
	}

	/**
	 * Returns the first element of the deque
	 * 
	 */
	public int getFirst() throws EmptyDequeException {
		// COMPLETE THIS METHOD

		return A[front]; // replace this line with your code
	}

	/**
	 * Returns the last element of the deque
	 * 
	 */
	public int getLast() throws EmptyDequeException {
		// COMPLETE THIS METHOD

		return A[rear-1]; // replace this line with your code
	}

	/**
	 * Inserts e at the beginning (as the first element) of the deque
	 * 
	 */
	public void insertFirst(int e) {

		if (size() == capacity -1) {
			capacity *= 2;
			int[] arr = Arrays.copyOf(A, capacity);
			for (int i = 1; i < A.length; i++) {
				arr[i] = arr[i - 1];
			}
			A[front] = e;
			A = arr;
			rear++;
		} else {
			
			for (int i = 1; i <= rear; i++) {
				A[i] = A[i - 1];
			}
			A[front] = e;
			rear++;
		}

	}

	/**
	 * Inserts e at the end (as the last element) of the deque
	 * 
	 */
	public void insertLast(int e) {
		if (size() == capacity -1) {
			int oldCap = capacity;
			capacity *= 2;
			int[] arr = Arrays.copyOf(A, capacity);
			for (int i = oldCap; i <= A.length; i++) {
				arr[i] = A[i - 1];
			}
			arr[rear] = e;
			A = arr;
			rear++;
		} else {
			A[rear] = e;
			rear++;
		}
	}

	/**
	 * Removes and returns the first element of the deque
	 * 
	 */
	public int removeFirst() throws EmptyDequeException {
		int val = A[front];
		if(size() == capacity/4) {
			capacity /=2;
			int [] arr = Arrays.copyOf(A, capacity);
			A = arr;
			for(int i = 1; i <= rear; i ++) {
				A[i-1] = A[i];
			}
		}
		else {
			for(int i = 1; i <= rear; i ++) {
				A[i-1] = A[i];
			}
		}
		
		rear --;

		return val; // replace this line with your code
	}

	/**
	 * Removes and returns the last element of the deque
	 * 
	 */
	public int removeLast() throws EmptyDequeException {
		int val = A[rear-1];
		if(size() == capacity/4) {
			capacity /=2;
			int [] arr = Arrays.copyOf(A, capacity);
			rear --;
			A = arr;
		}
		else {
			A[rear -1 ] = 0;
			rear --;
		
		}
		return val;
		 // replace this line with your code
	}

} // end class
