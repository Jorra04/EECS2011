/***********************************
* EECS2011 - Assignment 4
* File name: AVLTree.java
* Author: Singh, Jorra
* Email: jorrasingh04@gmail.com
* CSE number: 215709876
************************************/


/**  Implementation of an AVL tree. */
public class AVLTree extends BinarySearchTree implements Dictionary {

  public AVLTree(Comparator c)  { super(c); }

  public AVLTree() { super(); }

  /** Nested class for the nodes of an AVL tree. */ 
  protected static class AVLNode extends BTNode {

    protected int height;  // we add a height field to a BTNode

    /** Preferred constructor */
    AVLNode(Object element, BTPosition parent,
	    BTPosition left, BTPosition right) {
      super(element, parent, left, right);
      height = 0;
      if (left != null) 
        height = Math.max(height, 1 + ((AVLNode) left).getHeight());
      if (right != null) 
        height = Math.max(height, 1 + ((AVLNode) right).getHeight());
    } // we assume that the parent will revise its height if needed

    public void setHeight(int h) { height = h; }

    public int getHeight() { return height; }
  }


  /**
    * Print the content of the tree root.
    */
  public void printRoot() {
     System.out.println("printRoot: " + value(left(root())).toString() + " "
        +  value(root()).toString() + " " + value(right(root())).toString());
  }


  /**
    * Print the the tree using preorder traversal.
    */
  public void preorderPrint(Position v) {
      if (isInternal(v))
         System.out.print( value(v).toString() + " " );
      if (hasLeft(v)) preorderPrint(left(v));
      if (hasRight(v)) preorderPrint(right(v));
  }


  /** Creates a new binary search tree node (overrides super's version). */
  protected BTPosition createNode(Object element, BTPosition parent,
              BTPosition left, BTPosition right) {
    return new AVLNode(element,parent,left,right);  // now use AVL nodes
  }


  /** Returns the height of a node (call back to an AVLNode). */
  protected int height(Position p)  {
    return ((AVLNode) p).getHeight();
  }


  /** Sets the height of an internal node (call back to an AVLNode). */
  protected void setHeight(Position p)  { // called only if p is internal
    ((AVLNode) p).setHeight(1+Math.max(height(left(p)), height(right(p))));
  }


  /** Returns whether a node has balance factor between -1 and 1. */
  protected boolean isBalanced(Position p)  {
    int bf = height(left(p)) - height(right(p));
    return ((-1 <= bf) &&  (bf <= 1));
  }


  /** Returns a child of p with height no smaller than that of the other child 
    */
  protected Position tallerChild(Position p)  {
    if (height(left(p)) > height(right(p))) return left(p);
    else if (height(left(p)) < height(right(p))) return right(p);
    // equal height children - break tie using parent's type
    if (isRoot(p)) return left(p);
    if (p == left(parent(p))) return left(p);
    else return right(p);
  }


  /**
    * Insert a new element into the AVL tree.
    */
  public Entry insert(Object k, Object v) throws InvalidKeyException  {
    Entry toReturn = super.insert(k, v); // calls our new createNode method
    rebalance(actionPos); // rebalance up from the insertion position
    return toReturn;
  }


  /**
    * Remove an element from the AVL tree.
    */
  public Entry remove(Entry ent) throws InvalidEntryException {
    Entry toReturn = super.remove(ent);
    if (toReturn != null)   // we actually removed something
      rebalance(actionPos);  // rebalance up the tree
    return toReturn;
  }


  /**  
    * Rebalance method called by insert and remove.  Traverses the path from 
    * zPos to the root. For each node encountered, we recompute its height 
    * and perform a trinode restructuring if it's unbalanced.
    */
  protected void rebalance(Position zPos) {
    if(isInternal(zPos))
       setHeight(zPos);
    while (!isRoot(zPos)) {  // traverse up the tree towards the root
      zPos = parent(zPos);
      setHeight(zPos);
      if (!isBalanced(zPos)) { 
	// Perform a trinode restructuring starting from zPos's tallest grandchild
        Position xPos =  tallerChild(tallerChild(zPos));
        zPos = restructure(xPos); // tri-node restructure 
        setHeight(left(zPos));  // recompute heights
        setHeight(right(zPos));
        setHeight(zPos);
      }
    }
  } 





   // ***************************************
   // DO NOT MODIFY THE CODE ABOVE THIS LINE.
   // ADD YOUR CODE BELOW THIS LINE.
   //
   // ***************************************


  /** 
   * Perform a trinode restructuring starting from x, z's tallest grandchild.
   * Input: xPos, position of (pointer to) x
   * Output: position of (pointer to) the new root of the subtree that was restructured.
   */
  protected Position restructure( Position xPos ) {

	// COMPLETE THIS METHOD

	// You may add your own method(s) to this file.
	  AVLNode x = (AVLNode) xPos;
	  AVLNode y = (AVLNode) parent(x);
	  AVLNode z = (AVLNode) parent(y);
	  
	  if(y.equals(z.getRight()) && x.equals(y.getRight())) { //we have a single rotation. right oriented.
//		  left rotate on z
		  AVLNode root = (AVLNode) z.getParent();
		 
		  y = (AVLNode) z.getRight();
		  x = (AVLNode) y.getRight();
		  AVLNode t2 = (AVLNode) y.getLeft();
		  
		  if(root == null) {
			  this.root = y;
			  y.setParent(root);
		  }
		  else if(root.getLeft() == (z)) {
			  root.setLeft(y);
			  y.setParent(root);
		  }
		  else if(root.getRight() == (z)) {
			  root.setRight(y);
			  y.setParent(root);
		  }
		 y.setLeft(z);
		 y.setRight(x);
		 x.setParent(y);
		 z.setParent(y);
		 if(t2 != null ) {
			  t2.setParent(z);
		  }
		 z.setRight(t2);
		  return y;
	  }
	  else if( y.equals(z.getLeft()) && x.equals(y.getLeft()) ) { // we have a single rotation. left oriented.
//		  begin a right rotate on z
		  AVLNode root = (AVLNode) z.getParent();
		  
		  y = (AVLNode) z.getLeft();
		  x = (AVLNode) y.getLeft();
		  AVLNode t3 = (AVLNode) y.getRight();
		  if(root == null) {
			  this.root = y;
			  y.setParent(root);
		  }
		  else if(root.getLeft() == (z)) {
			  root.setLeft(y);
			  y.setParent(root);
		  }
		  else if(root.getRight() == (z)) {
			  root.setRight(y);
			  y.setParent(root);
		  }
		  y.setLeft(x);
		  y.setRight(z);
		  z.setParent(y);
		  x.setParent(y);
		  if(t3 != null) {
			  t3.setParent(z);
		  }
		  
		  z.setLeft(t3);
		  return y;
	  }
	  else if( y.equals(z.getRight()) && x.equals(y.getLeft()) ) { //Need a double rotation. R,L
//		  begin a right rotate on y
		  AVLNode z1  = (AVLNode) y;
		  AVLNode root = (AVLNode) z1.getParent();
		  
		  AVLNode y1 = (AVLNode) z1.getLeft();
		  AVLNode x1 = (AVLNode) y1.getLeft();
		  AVLNode t3 = (AVLNode) y1.getRight();
		  if(root == null) {
			  this.root = y1;
			  y1.setParent(root);
		  }
		  else if(root.getLeft() == (z1)) {
			  root.setLeft(y1);
			  y1.setParent(root);
		  }
		  else if(root.getRight() == (z1)) {
			  root.setRight(y1);
			  y1.setParent(root);
		  }
		  y1.setLeft(x1);
		  y1.setRight(z1);
		  z1.setParent(y1);
		  x1.setParent(y1);
		  if(t3 != null) {
			  t3.setParent(z1);
		  }
		  
		  z1.setLeft(t3);
		  
		  
		  //left rotate on z
		  
		  AVLNode z2 = (AVLNode) z;
		  AVLNode root2 = (AVLNode) z2.getParent();
		 
		  AVLNode y2= (AVLNode) z2.getRight();
		  AVLNode x2 = (AVLNode) y2.getRight();
		  AVLNode t2 = (AVLNode) y2.getLeft();
		  
		  if(root2 == null) {
			  this.root = y2;
			  y2.setParent(root2);
		  }
		  else if(root2.getLeft() == (z2)) {
			  root2.setLeft(y2);
			  y2.setParent(root2);
		  }
		  else if(root2.getRight() == (z2)) {
			  root2.setRight(y2);
			  y2.setParent(root2);
		  }
		 y2.setLeft(z2);
		 y2.setRight(x2);
		 x2.setParent(y2);
		 z2.setParent(y2);
		 if(t2 != null ) {
			  t2.setParent(z2);
		  }
		 z2.setRight(t2);
		  
		  return x;
	  }
	  else if( y.equals(z.getLeft()) && x.equals(y.getRight()) ) {//Need double rotation. L,R

		  
		  AVLNode z1 = (AVLNode) y;
		  AVLNode root1 = (AVLNode) z1.getParent();
		 
		  AVLNode y1 = (AVLNode) z1.getRight();
		  AVLNode x1 = (AVLNode) y1.getRight();
		  AVLNode t2 = (AVLNode) y1.getLeft();
		  
		  if(root1 == null) {
			  this.root = y1;
			  y1.setParent(root1);
		  }
		  else if(root1.getLeft() == (z1)) {
			  root1.setLeft(y1);
			  y1.setParent(root1);
		  }
		  else if(root1.getRight() == (z1)) {
			  root1.setRight(y1);
			  y1.setParent(root1);
		  }
		 y1.setLeft(z1);
		 y1.setRight(x1);
		 x1.setParent(y1);
		 z1.setParent(y1);
		 if(t2 != null ) {
			  t2.setParent(z1);
		  }
		 z1.setRight(t2);
//		  
//		 //right rotate on z
//		 
		 AVLNode z2 = (AVLNode) z;
		  AVLNode root = (AVLNode) z2.getParent();
		  
		  AVLNode y2 = (AVLNode) z2.getLeft();
		  AVLNode x2 = (AVLNode) y2.getLeft();
		  AVLNode t3 = (AVLNode) y2.getRight();
		  if(root == null) {
			  this.root = y2;
			  y2.setParent(root);
		  }
		  else if(root.getLeft() == (z2)) {
			  root.setLeft(y2);
			  y2.setParent(root);
		  }
		  else if(root.getRight() == (z2)) {
			  root.setRight(y2);
			  y2.setParent(root);
		  }
		  y2.setLeft(x2);
		  y2.setRight(z2);
		  z2.setParent(y2);
		  x2.setParent(y2);
		  if(t3 != null) {
			  t3.setParent(z2);
		  }
		  
		  z2.setLeft(t3);

		  
		  return x;
	  }
	  
	  
//should never reach here. should be one of the above four cases
	return ( xPos );	// replace this line with your code

  } // restructure
  
  
} // end AVLTree class