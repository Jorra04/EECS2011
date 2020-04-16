/***********************************
* File name: BinaryTree.java
* Author: Singh, Jorra
* Student ID: 215709876
* EECS login ID: jorra04
************************************/

public class BinaryTree
{
	public class TreeNode
	{
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		// Constructor
		public TreeNode( int d )
		{
			data = d;
			left = null;
			right = null;
		}  // end constructor TreeNode
	}  // end class BinaryNode
	
	private TreeNode root;
	
	// Constructor
	public BinaryTree( )
	{
		root = null;
	}  // end constructor BinaryTree	
	
    
    /**
     * Insert an integer d into the tree  
     */
    public void insert( int d )
    { 
		// This method is used to build the binary tree.
		// We are not concerned with how the tree is built.
		
		if ( root == null )
			root = new TreeNode( d );
		else {	
			TreeNode c = root;
			TreeNode par = null;
			while( c != null ) {
				par = c;
				if ( d < c.data )
					c = c.left;
				else
					c = c.right;	
			}	// end while
			if( d < par.data )
				par.left = new TreeNode( d );
			else
				par.right = new TreeNode( d );
		}  // end else			
    }  // end insert



	/**************************************************************
 	* DO NOT ADD ANYTHING ABOVE THIS LINE EXCEPT YOUR STUDENT INFO
 	***************************************************************/
 	
 	/**
     * Returns true if the binary tree contains key zero, and false otherwise.
     * Returns false if the tree is empty. 
 	 * Add a brief description of how your algorithm works below.
     */
     
    /* Brief description: ....................................
		we implement a helper function that checks if a given node exists.
		The helper function is passed the root of the tree.
		 
		 If the root of the tree is null, the function returns false, indicating
		 the key is not present.
		 
		 if the node passed holds the data that we are looking for, the method returns true.
		 
		 if we have a left node, we will search through that subtree, and so on recursively until
		 we have gone through it all.
		 
		 If we have gone through the entire left subtree, we will then go through the right subtree.
		  
		  **we pass 0 to the finder function**
 	 */
       
    public boolean hasZero( )
    {    
   		// COMPLETE THIS METHOD.

   		// DO NOT CHANGE the above method declaration.

   		// You may define local variables inside this method.  Do not use global variables.

   		// You may add your own helper methods/subroutines to this file.
   		
   		// NOTE: The external nodes are not dummy nodes but contain actual data (integers).
    	
    	// THE FOLLOWING BORROWS IDEAS FROM THE TEXTBOOK GIVEN TO US.
    	// IDEAS WERE SOURCED FROM SECTION 11.1 PG 467
    	
    	return findNode(root,0);	// replace this line with your code
		
    }	// end hasZero
    public boolean findNode(TreeNode root, int key) {
    	if(root == null) {
    		return false;
    	}
    	if(root.data == key) {
    		return true;
    	}
    	if(root.left != null) { //if we have left node.
    		return findNode(root.left,key); //traverse the tree and find occurrence in left subtree
    	}
    	if(root.right != null ) { //if we have right node.
    		return findNode(root.right,key); //traverse the tree and find occurrence in right subtree
    	}
    	return false; //nothing found

    }
    		
}  // end class BinaryTree	