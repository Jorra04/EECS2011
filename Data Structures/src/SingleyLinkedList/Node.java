package SingleyLinkedList;

public class Node <E>{
	private E element;
	private Node<E> next;
	
	
	/*
	 * Constructors
	 */
	public Node() {
		this(null,null);
	}
	public Node(E e, Node<E> n) {
		this.element = e;
		this.next = n;
	}
	
	
	/*
	 * Accessors
	 */
	public E getElement() {
		return this.element;
	}
	public Node<E> getNext() {
		return this.next;
	}
	
	/*
	 * Modifiers
	 */
	public void setElement(E newElem) {
		this.element = newElem;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	public String printer() {
		return ""+getElement();
	}
	
}
