import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testCases {
	
	public static String preOrderPrint(AVLTree T, Position v) {
		String result = "";
		return preorderPrintHelper(T,v,result);
	}
	
	
	public static String preorderPrintHelper(AVLTree T,Position v,String s) {
		if (T.isInternal(v))
	         s += T.key(v).toString() + " ";
	      if (T.hasLeft(v)) preorderPrintHelper(T, T.left(v),s);
	      if (T.hasRight(v)) preorderPrintHelper(T, T.right(v),s);
		return s;
	}
	public static String postorderPrint(AVLTree T,Position v) {
		String result = "";
		if (T.hasLeft(v)) postorderPrint(T, T.left(v));
	      if (T.hasRight(v)) postorderPrint(T, T.right(v));
	      if (T.isInternal(v))
	         result += T.key(v).toString() + " ";
		return result;
	}	

	@Test
	void test1a() {
		AVLTree t = new AVLTree();
		t.insert(30, 30);
		t.insert(40, 40);
		t.insert(50, 50);
		System.out.println(preOrderPrint(t,t.root));
	}

}
