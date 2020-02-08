package SingleyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test01() {
		Node node = new Node("Jorra",null);
		Node node2 = new Node("Inder",null);
		node.setNext(node2);
		
		assertEquals(node.getNext().getElement(),node2.getElement());
	}
	@Test
	void test02() {
		Node node = new Node("Jorra",null);
		Node node2 = new Node("Inder",null);
		node.setNext(node2);
		
		assertEquals(node2.getNext(),null);
	}
	@Test
	void test03() {
		Node node = new Node("Jorra",null);
//		System.out.println(node.getElement());
//		System.out.println(node.getNext());
		
		Node node2 = new Node("Inder",null);
//		System.out.println(node2.getElement());
//		System.out.println(node2.getNext());
		node.setNext(node2);
//		System.out.println(node.getNext().getElement());
		Node node3 = new Node("Faizan",null);
		node.setNext(node3);
//		System.out.println(node3.getElement());
//		System.out.println(node3.getNext());
//		System.out.println(node.getNext().getElement());
		
		
		assertEquals(node.getNext().getElement(),node3.getElement());
	}

}
