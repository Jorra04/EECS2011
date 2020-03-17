package Q1;

/***********************************
* EECS2011 - Assignment 3
* File name: ArrayMain.java
* Author: U. T. Nguyen
************************************/

public class ArrayMain {

   public static void main(String[] args) {
	ArrayDeque q = new ArrayDeque();
	q.insertFirst(120);
	q.printDeque();
	q.insertFirst(15);
	q.printDeque();
	System.out.println("first=" + q.getFirst());
	System.out.println("last=" + q.getLast());
	q.insertLast(401);
//	System.out.println("size "+q.size());
	q.printDeque();
	q.insertLast(65);
	q.printDeque();
	q.insertLast(37);
	q.printDeque();
//	System.out.println("size "+q.size());

	System.out.println("first=" + q.getFirst());
	System.out.println("last=" + q.getLast());
	System.out.println("remove first=" + q.removeFirst());
	q.printDeque();
	System.out.println("remove last=" + q.removeLast());
	System.out.println("remove last=" + q.removeLast());
	q.printDeque();
        System.out.println("remove first=" + q.removeFirst());
        System.out.println("remove first=" + q.removeFirst());
	// q is now empty.

 	int i, k;
	for( i = 1; i <= 100; i ++ )
	   q.insertLast(i);
	   q.printDeque();  // 100 elements in q

	for( i = 1; i <= 99; i++ )
	   k = q.removeFirst();
        q.printDeque();  // one element left
//    System.out.println(q.size());
//    System.out.println(q.capacity);
//	q.insertFirst(67899);
//	q.insertLast(67898 );
//	q.insertLast(67897 );
//	q.insertLast(67896 );
//	q.insertLast(67895 );
//	q.insertLast(67894 );
//	q.insertLast(67893 );
//	q.insertLast(67892 );
//	q.insertLast(67891 );
//	q.insertLast(67890 );
//	q.printDeque();
	
   }
   
}
