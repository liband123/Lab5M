public abstract class BinarySearchTree
{
	protected Node root;
	protected int size;

	public abstract boolean add(final int data);
	public int getSize() { return size; }

	protected static class Node
	{
		int data;
		Node left, right;
		Node(final int data) {
			this.data = data;
			left = null;
			right = null; }
	}
}
