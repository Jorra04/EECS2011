/***********************************
*
* CSE2011 - Fundamentals of Data Structures
* File name: test4.java
*
************************************/


import java.io.*; 	// to read/write files

public class test4 {

   public static void printOutput(AVLTree t){
        //System.out.print("Preorder : ");
        //TreePrint.preorderPrint(t, t.root());
        //System.out.println();
        System.out.print("Postorder: ");
        TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{


	//------------------------------------------
        AVLTree t2 = new AVLTree();

        t2.insert(90, 90);
        t2.insert(80, 80);
        t2.insert(70, 70);

        t2.insert(60, 60);
        t2.insert(50, 50);

        t2.insert(40, 40);


        t2.insert(30, 30);
        printOutput(t2);

        //System.out.println("Input: 90, 80, 70, 60, 50, 40, 30");
        //System.out.println();

   } // method main

} // class myProgram
