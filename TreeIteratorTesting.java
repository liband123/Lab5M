/**
 * A testing utility class to validate the tree iterator.
 */
public class TreeIteratorTesting {

    public final int[] values;  // Values of the nodes at the time of this object's initialization

    public TreeIteratorTesting(BinarySearchTree bst, ITreeIterator treeIter) {
        // Add some values
        bst.add(5);
        bst.add(6);
        bst.add(8);
        bst.add(9);
        bst.add(10);

        // Convert BST to array
        values = treeIter.SequenceArray(bst);
    }

    /**
     * Compute the average of the values.
     * @return The average.
     */
    public double average() {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }

    /**
     * Find the maximum value.
     * @return The maximum.
     */
    public int max() {
        int max = Integer.MIN_VALUE;
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
