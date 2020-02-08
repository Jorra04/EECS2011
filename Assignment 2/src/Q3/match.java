package Q3;

/***********************************
* CSE2011 - Assignment 2
* File name: match.java
* Author: Singh, Jorra
* Email: jorraisngh04@gmail.com
* CSE number: 215709876
************************************/


public class match {

/*
 * EXHAUSTIVE ALGORITHM
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(n).
 * You may add a brief explanation here if you wish.
 */


public static int match_exh( int[] A, int n ) 
{
	int val = -1;
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	for(int i = 0; i < n; i ++) {
		if(A[i] == i) {
			return i;
		}
	}

	return val;
	} // end match_exh




/*
 * DIVIDE-AND-CONQUER ALGORITHM
 * Returns index i if array A contains an element A[i] such that A[i] = i.
 * If there exist many of such elements, return the index of any one of them.
 * Returns -1 if there exists no element A[i] such that A[i] == i.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(logn).
 * You may add a brief explanation here if you wish.
 */

public static int match_dac( int[] A, int n )
{
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	int beg = 0;
	int end = n-1;
	
	
	while(beg <= end) {
		int mid = (beg+end)/2;
		if(A[mid] < mid) {
			beg = mid+1;
		}
		else if(A[mid] > mid) {
			end = mid-1;
		}
		else {
			return mid;
		}
	}
	
	return -1;
	}  // end match_dac


} // end class