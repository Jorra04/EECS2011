package mergeSort;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random rand = new Random();
		int a[] = new int[rand.nextInt(15)];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(30);
		}
		
		printer(a);
		recMergeSort.sort(a, 0, a.length-1);
		printer(a);
	
	}
	
	static void printer(int[] a) {
		System.out.print("[");
		for(int i = 0; i < a.length; i ++) {
			if(i!= a.length -1) {
				System.out.print(a[i] + ", ");
			}
			else {
				System.out.print(a[i]);
			}
		}
		System.out.print("]\n");
	}
}
