package SingleyLinkedList;

public class Node {
	Node next;
	int val;
	
	Node() {
		this.next = null;
		this.val = 0;
	}
	Node(int val) {
		this.val = val;
		this.next = null;
	}
}
