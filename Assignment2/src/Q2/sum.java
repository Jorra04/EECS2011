package Q2;

import java.util.*;

/***********************************
* CSE2011 - Assignment 2
* File name: sum.java
* Author: Singh, Jorra
* Email: jorrasingh04@gmail.com
* CSE number: 215709876
************************************/


public class sum {


/*
 * EXHAUSTIVE ALGORITHM
 * Returns true if array A contains two elements whose sum is k.
 * Returns false otherwise.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(  ).
 * You may add a brief explanation here if you wish.
 */

public static boolean sum_exh( int[] A, int n, int k ){
	
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	for(int i = 0; i < n; i ++) {
		for(int j = 1; (j < n) && (i!=j); j ++) {
			if(A[i]+A[j] == k) {
				return true;
			}
		}
	}
	return false;
}  // end sum_exh





/*
 * RECURSIVE ALGORITHM
 * Returns true if array A contains two elements whose sum is k.
 * Returns false otherwise.
 * n is the number of elements A contains.
 *
 * The running time of your algorithm is O(  ).
 * You may add a brief explanation here if you wish.
 */

public static boolean sum_rec( int[] A, int n, int k ){
   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.
	Set<Integer> mySet = new HashSet<>();
	for(int i : A) {
		mySet.add(i);
	}
	for(int i = 0; i < A.length; i++) {
		if(mySet.contains((Integer)k-A[i])) {
			return true;
		}
	}
	return false;

}  // end sum_rec


} // end class
