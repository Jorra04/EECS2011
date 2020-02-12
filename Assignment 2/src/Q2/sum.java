package Q2;

/***********************************
* CSE2011 - Assignment 2
* File name: sum.java
* Author: Singh, Jorra
* Email: jorrasingh04@gmail.com
* CSE number: 215709876
************************************/


public class sum {

	/*
	 * EXHAUSTIVE ALGORITHM Returns true if array A contains two elements whose sum
	 * is k. Returns false otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O(n^2). You may add a brief explanation
	 * here if you wish.
	 */

	public static boolean sum_exh(int[] A, int n, int k) {

		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file.
		for (int i = 0; i < n; i++) {
			for (int j = 1; (j < n) && (i != j); j++) {
				if (A[i] + A[j] == k) {
					return true;
				}
			}
		}
		return false;
	} // end sum_exh

	/*
	 * RECURSIVE ALGORITHM Returns true if array A contains two elements whose sum
	 * is k. Returns false otherwise. n is the number of elements A contains.
	 *
	 * The running time of your algorithm is O(n). You may add a brief explanation
	 * here if you wish.
	 */

	public static boolean sum_rec(int[] A, int n, int k) {
		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file. 
		//pointers.
		int i = 0;
		int j = n - 1;

		return sum_recHelper(A, k, i, j);
	}

// end sum_rec
	private static boolean sum_recHelper(int[] a, int val, int i, int j) {
		if (i == j) { //if i and j are equal, we've traversed the entire array, 
			//and haven't found a match. 
			return false;
		}

		if (a[i] + a[j] == val) { //if they're equal, return true;
			return true;
		}

		if (a[i] + a[j] < val) {
			return sum_recHelper(a, val, i + 1, j); //shrink
		}

		return sum_recHelper(a, val, i, j - 1); // shrink
	}
} // end class


