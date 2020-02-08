package Q1;

/***********************************
* CSE2011 - Assignment 2 
* File name: symm.java 
* Author: Singh, Jorra
* Email: jorrasingh04@gmail.com 
* CSE number: 215709876
 ************************************/

public class symm {

	/*
	 * Returns true if array A is symmetric. Returns false otherwise. n is the
	 * number of elements A contains.
	 *
	 * The running time of your algorithm is O( ). You may add a brief explanation
	 * here if you wish.
	 */

	public static boolean symmetric(int[] A, int n) {
		// COMPLETE THIS METHOD.

		// You may define local variables inside this method.

		// You may add your own methods/subroutines to this file.
		int i = 0;
		int j = n - 1;

		return SymmHelper(A, i, j);
	}

	public static boolean SymmHelper(int[] a, int i, int j) {
		if (i > j) {
			return true;
		}
		if (a[i] == a[j]) {
			return SymmHelper(a, i + 1, j - 1);

		}
		return false;
	}

} // end class
