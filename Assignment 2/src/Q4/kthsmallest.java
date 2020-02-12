package Q4;

import java.util.Arrays;

/***********************************
* CSE2011 - Assignment 2
* File name: kthsmallest.java
* Author: Singh, jorra
* Email: jorrasingh04@gmail.com
* CSE number: 215709876
************************************/


public class kthsmallest {

public static final int MaxSize = 500;

/*
 * Return the value of the kth smallest element of array A.
 * n is the number of elements A contains, and k <= n.
 * The running time of your algorithm must be O(n).
 *
 */

public static int find_kth_smallest( int[] A, int n, int k )
{

   // COMPLETE THIS METHOD.

   // You may define local variables inside this method.

   // You may add your own methods/subroutines to this file.


   /* Note 1:
    * During the partitioning process, array elements may be swapped and moved around.
    * DO NOT modify the content of array A.  Copy it to a temporary array B and work on B instead.
    */

   /* Note 2:
    * DO NOT SORT THE WHOLE ARRAY and then return B[k-1].  That would take O(nlogn) time.
    * If you do that, your program will get zero point.
    */
	int[] b =Arrays.copyOf(A, A.length);
	
	return finder(b,0,n-1,k-1); //fixes indexing problem.
	


}  // end find_kth_smallest

	public static int finder(int[] arr, int first, int last, int k) {
		int partition = kthsmallest.partition(arr, first, last);

		if (partition == k) {
			return arr[k];
		}
		if (partition < k) {
			return finder(arr, partition + 1, last, k);
		} else {
			return finder(arr, first, partition - 1, k);
		}

	}

	public static int partition(int a[], int low, int high) {
		int piv = a[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (a[j] < piv) {
				i++;

				swap(a, i, j);
			}
		}

		swap(a, high, i + 1);
		return i + 1;
	}

	/*
	 * swap function to simplify code.
	 */
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

} // end class
