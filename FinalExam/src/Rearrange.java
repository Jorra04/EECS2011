/***********************************
* File name: Rearrange.java
* Author: Singh, Jorra
* Student ID: 215709876
* EECS login ID: jorra04
************************************/

public class Rearrange
{

/**************************************************************
 * DO NOT ADD ANYTHING ABOVE THIS LINE EXCEPT YOUR STUDENT INFO
 ***************************************************************/

/* 
 * Rearrange the array so that all the negative numbers 
 * appear before all the non-negative numbers. 
 * n is the number of elements A contains.
 *
 * The running time of your algorithm must O( n ).
 * Add a brief description of how your algorithm works below.
 */

/* Brief description: ....................................
	The rearrangeArray function instantiates two dummy pointers. It them passes these
	to a helper function rearrangeHelper. The rearrangeHelper function returns (ends)
	when the "i" counter reaches n. The "i" counter is incremented every time 
	the helper function is called, mimicking a loop.
	The  "J" counter increments when it sees a value that is negative. 
	Once a negative value is found, and the indicies are not equal, the swap begins.
	
	we then recall this function until we reach n. 
	
	method operates in o(n) time
 */
 
public static void rearrangeArray( int[] A, int n )
{
   // COMPLETE THIS METHOD.

   // DO NOT CHANGE the above method declaration.

   // You may define local variables inside this method. Do not use global variables.

   // You may add your own helper methods/subroutines to this file.
	
	/*
	 * IDEAS FOR THIS CODE WERE BORROWED FROM https://www.tutorialcup.com/interview/array/rearrange-positive-negative-numbers.htm
	 * I BORROWED THE DOUBLE POINTER TECHNIQUE FROM THE ABOVE AND MADE MY OWN ITERATIVE APPROACH.
	 * I THEN CONVERTED THAT ITERATIVE APPROACH TO A RECURSIVE ONE.
	 * I THEN REWORKED THAT TO A RECURRSIVE FUNCTION WITH A HELPER.
	 */

	int i = 0; //overall counter
	int j = 0; // negatives counter
	rearrangeHelper(i,j,A,n);
   
}  // end rearrangeArray

public static void rearrangeHelper(int i,int j, int[] A, int n) {
	if( i == n ) { //we have reached the end of the array.
		return;
	}
	if(A[i] < 0 && i != j) { // if its a negative and the indices are not the same.
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
		j++;
	}	
	else if( A[i] < 0) { //If its a negative.
			j++;
		}
	rearrangeHelper(i+1,j,A,n);
}


}  // end class

