import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		/*
		 * this is an example of a snippet of code that will run in O(n!)
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("input your value");
		int val = input.nextInt();
		System.out.println(factorial(val));
		input.close();
	}
	
	public static int factorial(int n) {
		if(n == 1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
