
public class midtermQ5_2 {

	public static void main(String[] args) {
		int[] a = {2,1};
		int[]b = {6,3};
		int[]c = {7,5};
		int[]d = {-2,1};
		
		d = c;
		a[1] = c[1]+b[1];
		c = a;
		b[1] = c[1]+a[1];
		a =d;
		c[1] = a[1]+b[1];
		
		System.out.println(a[1]);
		System.out.println(b[1]);
		System.out.println(c[0]);
	}

}
