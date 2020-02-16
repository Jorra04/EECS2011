package DoublyLinkedList;

public class DoublyLinked {
	Node head;
	int size;
	
	DoublyLinked(){
		this.head = null;
		this.size = 0;
	}
	
	
	public void push(int data) {
		Node newNode = new Node(data);
		newNode.prev = null;
		newNode.next = head;
		
		if(head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}
	
	public void insertAfter(Node node, int data) {
		if(node == null) {
			throw new NullPointerException("Node is null");
		}
		Node newNode = new Node(data);
		newNode.next = node.next;
		node.next = newNode;
		newNode.prev = node;
		
		if(newNode.next != null) {
			newNode.next.prev = newNode;
		}
	}
	public String printAll() {
		String str = "";
		Node curr = head;
		if(head == null) {
			throw new NullPointerException();
		}
		while(curr != null) {
			if(curr.next != null ) {
				str+= curr.data + " -> ";
			}
			else {
				str+= curr.data;
			}
			
			curr = curr.next;
		}
		return str;
	}
	public void printMid() {
		Node slow = head;
		Node fast = head;
		if(head != null) {
			while(fast != null  && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("Middle element is: " + slow.data );
		}
	}
	public Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node next = null;
		while( curr != null ) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}
}
