
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
