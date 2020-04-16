/***********************************
*
* CSE2011 - Fundamentals of Data Structures
* File name: test5.java
*
************************************/


import java.io.*; 	// to read/write files

public class test5 {

   public static void printOutput(AVLTree t){
        System.out.print("Preorder: ");
        TreePrint.preorderPrint(t, t.root());
        System.out.println();
        //System.out.print("Postorder: ");
        //TreePrint.postorderPrint(t, t.root());
        //System.out.println();
        //System.out.println();
   }


   public static void main (String[] args) throws IOException{


        AVLTree t3 = new AVLTree();

        t3.insert(30, 30);
        t3.insert(40, 40);
        t3.insert(35, 35);

        t3.insert(50, 50);
        t3.insert(45, 45);

        t3.insert(38, 38);

        t3.insert(48, 48);
        printOutput(t3);

        //System.out.println("Input: 30, 40, 35, 50, 45, 38, 48");
        //System.out.println();

   } // method main

} // class myProgram
