
public class recReverseChecker {

	public static void main(String[] args) {
		int[]a = {1,2,3,4,5,6};
		int [] b = {6,5,4,3,2,1,0};
		System.out.println(isRev(a,b));

	}
	public static boolean isRev(int[] a, int[] b) {
		int i = 0;
		int j = b.length-1;
		return isRevHelper(a,b,i,j);
	}
	
	public static boolean isRevHelper(int[] a, int[] b, int i, int j) {
		if(a.length != b.length) {
			return false;
		}
		if(i == a.length ) {
			return true;
		}
		if(a[i] != b[j]) {
			return false;
		}
		return isRevHelper(a,b,++i,--j);
	}


}
