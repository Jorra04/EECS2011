
public class recSum {

	public static void main(String[] args) {
		int[]a = {1,2,3,4};
		System.out.println(sum(a));
		int []b = {};
		System.out.println(sum(b));
	}
	
	public  static int sum(int[]a) {
		int i = 0;
		int val = 0;
		return sumHelper(a,i,val);
	}
	
	public static int sumHelper(int[]a,int i, int val) {
		if(i == a.length) {
			return val;
		}
		val+=a[i];
		return sumHelper(a,i+1,val);
	}

}
