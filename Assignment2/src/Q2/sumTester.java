package Q2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sumTester {

	@Test
	void test01() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 50;
		boolean exp = true;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test01Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 50;
		boolean exp = true;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test02() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 60;
		boolean exp = true;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test02Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 60;
		boolean exp = true;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test03() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 30;
		boolean exp = true;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test03Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 30;
		boolean exp = true;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test04() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 90;
		boolean exp = true;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test04Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 90;
		boolean exp = true;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test05() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 95;
		boolean exp = true;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test05Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 95;
		boolean exp = true;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test06() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 23;
		boolean exp = false;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test06Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 23;
		boolean exp = false;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test07() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 53;
		boolean exp = false;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test07Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 53;
		boolean exp = false;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test08() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 63;
		boolean exp = false;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test08Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 63;
		boolean exp = false;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test09() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 3;
		boolean exp = false;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test09Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 3;
		boolean exp = false;
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}
	@Test
	void test10() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 100;
		boolean exp = false;
		boolean got = sum.sum_exh(arr, arr.length, val);
		assertEquals(exp,got);
	}
	@Test
	void test10Rec() {
		int[] arr = {5,10,15,20,25,30,35,40,45,50};
		int val = 100;
		boolean exp = false;	
		boolean got = sum.sum_rec(arr, arr.length, val);
		assertEquals(exp,got);
		
	}

}
