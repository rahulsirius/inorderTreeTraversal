package com;

public class BinaryTree {

	Node root;
	
	public BinaryTree() {
		root = null;
	}
	
	void MorrisTraversal(Node node){
		
		Node current, pre;
		
		if(root == null)
			return;
		
		current = root;
		
		while(current != null){
			if(current.left == null){
				System.out.print(current.data + " ");
				current = current.right;
			}else{
				//Find the inorder predecessor of current
				pre = current.left;
				while(pre.right != null && pre.right != current)
					pre = pre.right;
				
				//Mark current as right child of its inorder predecessor
				if(pre.right == null){
					pre.right = current;
					current = current.left;
				}//fix the right child of predecssor
				else{
					pre.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				}
			}
		}
		
	}

}
