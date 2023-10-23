public abstract class BinarySearchTree { 
	protected Node root; protected int size; 
	protected static class Node { 
		int data; 
		Node left; 
		Node right; 
		Node(int data) { 
			this.data = data; 
			left = null; 
			right = null; } } 
	public abstract boolean add(int data); 
	public int getSize() { 
		return size; } }
