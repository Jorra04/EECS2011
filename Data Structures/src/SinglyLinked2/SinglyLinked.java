package SinglyLinked2;

public class SinglyLinked {
	Node head;
	Node tail;
	int size;
	
	SinglyLinked(){
		this.head = null;
		this.tail = this.head;
		this.size = 0;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public void push(int val) {
		
		Node node = new Node(val);
		node.next = head;
		head = node;
		if(this.size == 0) {
			tail = head;
		}
		this.size++;
	}
	public void insertAfter(Node prev, int val) {
		Node node = new Node(val);
		node.next = prev.next;
		prev.next = node;
		this.size++;
		
	}
	public void insertLast(int val) {
		Node node =  new Node(val);
		tail.next = node;
		node.next = null;
		tail = node;
	}

	/*
	 * returns the value that tail points to
	 * returns Integer.MIN_VALUE if the tail pointer is null;
	 */
	public int last() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return tail.val;
	}
	/*
	 * returns the value that head points to
	 * returns Integer.MIN_VALUE if the head pointer is null;
	 */
	public int first() {
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}
		return head.val;
	}
	public int removeLast() {
		int val = this.tail.val;
		Node node = this.head;
		while(node.next.next != null ) {
			node = node.next;
		}
		this.tail = node;
		this.tail.next = null; //needed depending on your implementation.

		
		return val;
	}
	public String printList() {
		Node curr = head;
		String str = "";
		while(curr != null) {
			if(curr.next != null) {
				str+=curr.val + " -> ";
			}
			else {
				str+=curr.val;
			}
			curr = curr.next;
		}
		return str;
	}
}
