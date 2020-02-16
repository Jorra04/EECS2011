package SingleyLinkedList;

public class SinglyLinked {
	Node head;
	int size;
	
	
	SinglyLinked(){
		this.head = null;
		this.size = 0;
	}
	
	public void push(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		this.size++;
	}
	public void insertAfter(Node prev, int val) {
		Node node = new Node(val);
		if(prev == null ) {
			System.out.println("cannot insert after null.");
		}
		
		node.next = prev.next;
		prev.next = node;
		this.size++;
		
	}
	public void insertLast(int val) {
		Node node = new Node(val);
		if(head == null ) {
			head = node;
			return;
		}
		
		Node curr = head;
		while(curr.next != null ) {
			curr = curr.next;
		}
		curr.next = node;
		node.next = null;
		this.size++;
	}
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	
	public String printer() {
		Node curr = this.head;
		String str = "";
		while(curr != null ) {
			if(curr.next != null ) {
				str+= curr.val + " -> ";
			}
			else {
				str+= curr.val;
			}
			curr = curr.next;
		}
		return str;
	}
}
