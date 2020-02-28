package SingleyLinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTester {

	@Test
	void test01() {
		sLinkedList list = new sLinkedList();
		Node node1 = new Node("Julian",null);
		Node node2 = new Node("Brandon",null);
		Node node3 = new Node("Romy",null);
		Node node4 = new Node("Jorra",null);

		list.addFirst(node1);
		list.addLast(node2);
		list.addLast(node3);
		list.addLast(node4);
		
		assertEquals(4,list.size());
	}
	@Test
	void test02() {
		sLinkedList list = new sLinkedList();
		Node node1 = new Node("Julian",null);
		Node node2 = new Node("Brandon",null);
		Node node3 = new Node("Romy",null);
		Node node4 = new Node("Jorra",null);

		list.addFirst(node1);
		list.addLast(node2);
		list.addLast(node3);
		list.addLast(node4);
		
		assertEquals(node4, list.last());
	}
	@Test
	void test03() {
		sLinkedList list = new sLinkedList();
		Node node1 = new Node("Julian",null);
		Node node2 = new Node("Brandon",null);
		Node node3 = new Node("Romy",null);
		Node node4 = new Node("Jorra",null);

		list.addFirst(node1);
		list.addLast(node2);
		list.addLast(node3);
		list.addLast(node4);
		
		assertEquals(node1, list.first());
	}
	@Test
	void test04() {
		sLinkedList list = new sLinkedList();

		
		assertEquals(0, list.size());
	}
	@Test
	void test05() {
		sLinkedList list = new sLinkedList();

		
		assertEquals(null, list.last());
	}
	@Test
	void test06() {
		sLinkedList list = new sLinkedList();

		
		assertEquals(null, list.first());
	}
	@Test
	void test07() {
		sLinkedList list = new sLinkedList();
		Node node1 = new Node("Julian",null);

		
		assertEquals(list.first(), list.last());
	}
	@Test
	void test08() {
		sLinkedList list = new sLinkedList();
		Node node1 = new Node("Julian",null);

		//testing reflexivity.
		assertEquals(list.last(), list.first());
	}
	

}
