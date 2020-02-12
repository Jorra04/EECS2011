package Q4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class kthSmallestTester {

	@Test
	void test() {
		int[] myArr = {1,2,3,4,5,6,7,8,9};
		int k = 3;
		int exp = 3;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	
	@Test
	void test01() {
		int[] myArr = {0,9,7,9,6,2,7,1,3};
		int k = 1;
		int exp =0;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	@Test
	void test02() {
		int[] myArr = {10,6,20,60,21,78,2,32,10,9};
		int k = 3;
		int exp =9;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	@Test
	void test03() {
		int[] myArr = {10,6,20,60,21,78,2,32,10,9};
		int k = 10;
		int exp =78;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	@Test
	void test04() {
		int[] myArr = {10,6};
		int k = 1;
		int exp =6;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	@Test
	void test05() {
		int[] myArr = {10,6};
		int k = 2;
		int exp =10;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}
	@Test
	void test06() {
		int[] myArr = {10};
		int k = 1;
		int exp =10;
		int got = kthsmallest.find_kth_smallest(myArr, myArr.length, k);
		
		assertEquals(exp,got);
	}

}
