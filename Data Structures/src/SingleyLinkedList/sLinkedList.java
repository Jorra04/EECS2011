package SingleyLinkedList;

public class sLinkedList<E>{
	private Node <E> head;
	private Node <E> tail;
	private int size;
	
	/*
	 * Constructors.
	 */
	public sLinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	/*
	 * Accessors.
	 */
	
	public int size() {
		return this.size;
	}
	public boolean isEmpty() {
		return this.size == 0;
	}
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return head.getElement();
	}
	public E last() {
		if(isEmpty()) {
			return null;
		}
		return tail.getElement();
	}
	
	/*
	 * Modifiers 
	 */
	
	public void addFirst(E e) {
		head = new Node<E>(e,head);
		if(this.size == 0) {
			tail = head;
		}
		this.size++;
	}
	public void addLast(E e) {
		Node<E> newest = new Node<>(e,null);
		if(isEmpty()) {
			head = newest;
		}
		else {
			tail.setNext(newest);
		}
		this.tail = newest;
		this.size++;
	}
	
	public E removeFirst() {
		if(isEmpty()) {
			return null;
		}
		E answer = head.getElement();
		this.head = head.getNext();
		this.size--;
		if(this.size == 0) {
			this.tail = null;
		}
		return answer;
		
	}
	
	public String printLinkedList() {
		String result = "";
        Node current = head;
        while(current != null){
            result+= current.getElement();
            current = current.getNext();
        }
        return "List: " + result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
