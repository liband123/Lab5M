/**
 * Concrete implementation of the BinarySearchTree.
 */
public class myBinarySearchTree extends BinarySearchTree {
    
    @Override
    public boolean add(int data) {
        if (root == null) {
            root = new Node(data);  // Set root if tree is empty
            size++;
            return true;
        }
        return insert(root, data);  // Insert data recursively
    }

    /**
     * Recursive helper method to insert data.
     * @param current The current node.
     * @param data The data to be added.
     * @return True if data was added, false otherwise.
     */
    private boolean insert(Node current, int data) {
        if (data < current.data) {
            if (current.left == null) {
                current.left = new Node(data);  // Insert to the left if data is less
                size++;
                return true;
            }
            return insert(current.left, data);
        } else if (data > current.data) {
            if (current.right == null) {
                current.right = new Node(data);  // Insert to the right if data is greater
                size++;
                return true;
            }
            return insert(current.right, data);
        }
        return false; // Duplicate data, so not added
    }
}
