package quickSortAlgorithm;

public class partitioningStrats {

	public static void main(String[] args) {
		int[]a = {1,5,7,2,35,6,8,9};
		partition3(a,0,a.length-2);
		
		for(int i = 0; i < a.length; i ++ ) {
			System.out.print(a[i]+", ");
		}

	}
	
	
	static void partition3(int[ ] a, int i, int j) {
		int mid = (a.length)/2;
		int piv = a[mid];
		swap(a,mid,a.length-1);
		while(i <= j) {
			while(a[i]< piv) {
				i++;
			}
			while(a[j]> piv) {
				j--;
			}
			if(i <= j) {
				swap(a,i,j);
				i++;j--;
			}
		}
//		swap(a,mid,a.length-1);
	}
	
	static void swap(int []a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	

}
