package InsertionSort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {4,2,5,8,1,6,9};
		System.out.println(printer(arr));
		System.out.println("-----------");
		insertionSort(arr, arr.length);
		System.out.println(printer(arr));
	}
	public static void insertionSort(int[] arr, int n){
			for(int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i -1;
				while(j >=0 && arr[j] > key) {
					arr[j+1] = arr[j];
					j -- ;
				}
				arr[j+1] = key;
			}
	}
	
	public static String printer(int[] arr ) {
		String str = "";
		for(int i = 0; i < arr.length; i++) {
			if(i != arr.length -1 ) {
				str+= arr[i] + ", ";
			}
			else {
				str+= arr[i];
			}
		}
		return str;
	}
}
