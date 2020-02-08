package Q1;

public class symm {

	public static void main(String[] args) {
		int[] arr = {5,8,2,2,8,5};
		int[] arr1 = {10,7,50,16,20,16,50,7,10};
		int [] arr3 = {5,8,5};
		int [] arr4 = {1000,1000};
		int [] arr5 = {1};
		int [] arr6 = {10, 7, 50, 16, 20, 16, 50, 7, 1000};
		int [] arr7 = {10, 7, 50, 16, 20, 16, 50, 700, 10};
		int [] arr8 = {10, 7 ,50 ,16, 20, 16 ,5000, 7, 10};
		int [] arr9 = {10, 7, 50, 16, 20, 1600, 50, 7, 10};
		int [] arr10 = {10, 7, 50, 16, 1600, 50, 7, 10};
		int [] arr11 = {101, 152, 3 ,8, 4 ,64, 52, 48, 33, 18, 27, 56, 92, 569, 385, 2146, 211, 105, 43 ,283, 496, 18 ,37, 8, 19, 19, 8, 
				37, 18, 496, 283, 43, 105, 211, 2146, 385, 569, 92, 56, 27, 18, 33, 48, 52, 64, 4, 8 ,3 ,152, 101};
		int [] arr12 = {101, 251, 6 ,16, 9, 56, 25, 84, 31, 81, 72, 65, 29, 965, 583, 6412, 112, 501, 382, 694, 
				34, 81, 73, 91, 57, 570, 91, 73, 81, 34, 694, 382, 501, 112, 6412, 583, 965, 29, 65, 72, 81, 31, 84, 25, 56, 9, 16, 6, 251, 101};
 		System.out.println(symmetric(arr, 6));
		System.out.println(symmetric(arr1, 9));
		System.out.println(symmetric(arr3, 3));
		System.out.println(symmetric(arr4, 2));
		System.out.println(symmetric(arr5, 1));
		System.out.println(symmetric(arr6, 9));
		System.out.println(symmetric(arr7, 9));
		System.out.println(symmetric(arr8, 9));
		System.out.println(symmetric(arr9, 9));
		System.out.println(symmetric(arr10, 8));
		System.out.println(symmetric(arr11, arr11.length));
		System.out.println(symmetric(arr12, arr12.length));
		
	}
	public static boolean symmetric( int[] A, int n )
	{
	   // COMPLETE THIS METHOD.

	   // You may define local variables inside this method.

	   // You may add your own methods/subroutines to this file.
		int i = 0; 
		int j = n-1;
		
		return isSymm(A,i,j);
	}
	
	public static boolean isSymm(int [] a, int i, int j) {
		if(i > j) {
			return true;
		}
		if(a[i] == a[j]) {
			return isSymm(a,i+1,j-1); 
				
			}
		return false;
	}
	
	/*
	 * iterative approach, helps me to visualize recursion better.
	 */
//	public static boolean  isSymm2(int [] a) {
//		int i = 0;
//		int j = a.length-1;
//		boolean tf = true;
//		while(i <= j) {
//			if(a[i] == a[j]) {
//				tf = true;
//			}
//			else {
//				tf = false;
//				break;
//			}
//			j--;
//			i++;
//		}
//		return tf;
//	}

}
