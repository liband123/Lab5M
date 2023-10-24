public abstract class BinarySearchTree
{
	protected Node root;
	protected int size;

	public abstract boolean add(final int data);
	public int getSize() { return size; }

	protected static class Node
	{
		protected int data;
		protected Node left, right;
		protected Node(final int data) { this.data = data; }
	}
}
