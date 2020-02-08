import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class symmTester {

	@Test
	void test01() {
		int[] arr = {5,8,2,2,8,5};
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test02() {
		int[] arr = {10,7,50,16,20,16,50,7,10};;
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test03() {
		int [] arr = {5,8,5};
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test04() {
		int[] arr = {1000,1000};
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test05() {
		int[] arr = {1};
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test06() {
		int[] arr = {10, 7, 50, 16, 20, 16, 50, 7, 1000};
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test07() {
		int[] arr = {10, 7, 50, 16, 20, 16, 50, 700, 10};
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test08() {
		int[] arr = {10, 7 ,50 ,16, 20, 16 ,5000, 7, 10};	
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test09() {
		int[] arr = {10, 7, 50, 16, 20, 1600, 50, 7, 10};
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test10() {
		int[] arr = {10, 7, 50, 16, 1600, 50, 7, 10};
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test11() {
		int[] arr = {101, 152, 3 ,8, 4 ,64, 52, 48, 33, 18, 27, 56, 
				92, 569, 385, 2146, 211, 105, 43 ,283, 496, 18 ,37, 8, 19, 19, 8, 
				37, 18, 496, 283, 43, 105, 211, 2146, 385, 569, 92, 
				56, 27, 18, 33, 48, 52, 64, 4, 8 ,3 ,152, 101};
		boolean exp = true;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}
	@Test
	void test12() {
		int[] arr = {101, 251, 6 ,16, 9, 56, 25, 84, 31, 81, 72, 65, 29, 965, 583,
				6412, 112, 501, 382, 694, 34, 81, 73, 91, 
				57, 570, 91, 73, 81, 34, 694, 382, 501, 112, 6412, 583, 965,
				29, 65, 72, 81, 31, 84, 25, 56, 9, 16, 6, 251, 101};
		boolean exp = false;
		boolean got = symm.symmetric(arr, arr.length);
		assertEquals(exp,got);
	}

}
