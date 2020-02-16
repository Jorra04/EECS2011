package SingleyLinkedList;

public class Main {

	public static void main(String[] args) {
		SinglyLinked sl = new SinglyLinked();
		sl.push(5);
		sl.push(6);
		sl.push(7);
		System.out.println(sl.printer());
		sl.push(8);
		sl.insertAfter(sl.head.next, 65);
		System.out.println(sl.printer());
		sl.insertLast(4);
		System.out.println(sl.printer());
		sl.insertLast(3);
		System.out.println(sl.printer());
		sl.insertLast(2);
		System.out.println(sl.printer());
		sl.insertLast(1);
		System.out.println(sl.printer());
		
		System.out.println("---------------------------");
		
		SinglyLinked sl1 = new SinglyLinked();
		System.out.println(sl1.isEmpty());
		sl1.insertLast(5);
		System.out.println(sl1.printer());
		sl1.insertLast(4);
		System.out.println(sl1.printer());
		sl1.push(6);
		System.out.println(sl1.printer());
		System.out.println(sl1.isEmpty());
	}

}
