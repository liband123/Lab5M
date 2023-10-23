
public class myBinarySearchTree extends BinarySearchTree{
    protected Node root;
    protected int size;
    protected static class Node { 
        int data; 
        Node left; 
        Node right; 
        Node(int data) { 
            this.data = data; 
            left = null; 
            right = null;
            } 
        } 
    
    public myBinarySearchTree() {
        root = null;
        size = 0;
    }
    
    
    public boolean add(int data) {
        if (root == null) {
            root = new Node(data);
            size++;
            return true;
        }
        
        Node localRoot = root;
        for (;;) {
            if (data < localRoot.data) {
                if (localRoot.left != null)
                    localRoot = localRoot.left;
                else {
                    size++;
                    localRoot.left = new Node(data);
                    return true;
                }    
            }
            if (data >= localRoot.data) {
                if (localRoot.right != null)
                    localRoot = localRoot.right;
                else {
                    size++;
                    localRoot.right = new Node(data);
                    return true;
                }
            }
        }
    }
    
    public int getSize() {
        return size;
    }
}
