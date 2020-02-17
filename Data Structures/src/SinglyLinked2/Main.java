package SinglyLinked2;

public class Main {

	public static void main(String[] args) {
		SinglyLinked sl = new SinglyLinked();
		sl.push(0);
		sl.push(1);
		sl.push(2);
		sl.push(4);
		sl.insertAfter(sl.head, 3);
		System.out.println(sl.printList());
		System.out.println(sl.last());
		System.out.println("-------------");
		sl.insertLast(-1);
		System.out.println(sl.printList());
		System.out.println(sl.last());
		
		SinglyLinked sl2 = new SinglyLinked();
		System.out.println(sl2.last());
	}

}
