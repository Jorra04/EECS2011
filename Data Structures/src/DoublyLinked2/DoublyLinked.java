package DoublyLinked2;

public class DoublyLinked {
	Node head, tail;
	int size;
	
	DoublyLinked(){
		this.size =0;
		this.head = this.tail = null;
	}
	public void push(int val) {
		Node node = new Node(val);
		if(head == null ) {
			node.next = node.prev =null;
			head = node;
			tail = head;
		}
		else {
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	public void append(int val) {
		Node node = new Node(val);
		if(this.tail == null) {
			node.next = node.prev = null;
			tail = node;
		}
		else {
			node.prev = tail;
			tail.next = node;
			node.next = null;
			tail = node;
		}
	}
	public void insertAfter(Node prev, int val) {
		Node node = new Node(val);
		if(head == null ) {
			System.out.println("cannot attatch to a null node. Hint, use push/append.");
			return;
		}
		node.next = prev.next;
		node.prev = prev;
		prev.next.prev = node;
		prev.next = node;
	}
	
	public String printList() {
		Node curr = head;
		String str = "";
		while(curr != null) {
			if(curr.next != null ) {
				str+= curr.val+" -> ";
			}
			else {
				str+= curr.val;
			}
			curr = curr.next;
		}
		return str;
	}
}
