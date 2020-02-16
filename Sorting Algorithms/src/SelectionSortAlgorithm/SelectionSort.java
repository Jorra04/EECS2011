package SelectionSortAlgorithm;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = {4,2,5,8,1,6,9};
		System.out.println(printer(arr));
		System.out.println("-----------");
		selectionSort(arr,arr.length);
		System.out.println(printer(arr));
		
	}
	/*
	 * Selection sort finds the minimum element in the array every time.
	 */
	public static void selectionSort(int[] arr, int n) {
		for(int i = 0; i < n; i ++ ) {
			int minIndex = i;
			for(int j = i+1; j < n; j ++) {
				
				if(arr[j] < arr[minIndex] ) {
					minIndex= j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static String printer(int[] arr) {
		String str = "";
		for(int i=0; i < arr.length; i ++) {
			if(i != arr.length -1) {
				str+=arr[i]+ ", ";
			}
			else {
				str+=arr[i];
			}
		}
		return str;
	}
	
	
}
