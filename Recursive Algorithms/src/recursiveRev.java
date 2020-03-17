
public class recursiveRev {
	
	public static int [] rev(int[] a) {
		int i = 0;
		int  j = a.length -1;
		revHelper(a,i,j);
		return a;
	}
	public static void revHelper(int[] array, int initPos,int endPos) {
		if(initPos < endPos) {
			swap(array,initPos,endPos);
			revHelper(array,initPos+1, endPos-1);
		}
		return;
		
		
	}
	public static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	
	public static void printer(int [] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		printer(a);
		System.out.println("----------");
		printer(rev(a));

	}

}
