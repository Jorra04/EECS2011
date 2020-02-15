package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinked dl = new DoublyLinked();
		dl.push(5);
		dl.insertAfter(dl.head, 3);
		dl.insertAfter(dl.head.next, 2);
		dl.insertAfter(dl.head.next.next, 1);
		dl.insertAfter(dl.head.next.next.next, 0);
		
		dl.printAll();
		dl.reverse(dl.head);
		System.out.println("------------------");
		dl.printAll();
		
		

	}

}
