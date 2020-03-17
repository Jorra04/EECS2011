
public class Q4_13 {
	
	public static void example5(int[]first , int [] second ) {//assume equal lengths.
		int n = first.length;
		int Iiterations = 0;
		int Jiterations = 0; 
		int Kiterations = 0;
		for(int i = 0; i<n;i++) {
			Iiterations ++;
			for(int j =0; j <n;j++) {
				Jiterations++;
				for(int k= 0; k <= j; k++) {
					Kiterations++;
				}
			}
		}
		System.out.println(Iiterations);
		System.out.println(Jiterations);
		System.out.println(Kiterations);
	}

	public static void main(String[] args) {
		int []a = {1,1,1,1};
		int []b = a;
		example5(a,b);
	}

}
