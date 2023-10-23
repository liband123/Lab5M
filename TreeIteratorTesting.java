import java.util.stream.IntStream;

/**
 *
 * @since 23 October 2023
 * @author Julian Edwards
 *
 */
public class TreeIteratorTesting
{
    // the values in the binary search tree (at the time of this object's initialization).
    // this field is public because it makes testing easier (the whole point of this class).
    public final int[] values;
    public TreeIteratorTesting(final BinarySearchTree bst, final ITreeIterator treeIter) {
        // "In the constructor of this class, you will take in a binary search tree, and add some values to it."
        bst.add(5);
        bst.add(6);
        bst.add(8);
        bst.add(9);
        bst.add(10);
        // "Then, you will call the treeIter.SequenceArray(bst) to get the array of integer representing the
        // values of the nodes."
        values = treeIter.SequenceArray(bst);
    }

    /**
     * @return the average of the values.
     * @throws java.util.NoSuchElementException if there are no values present (should never happen).
     *
     * @since 23 October 2023
     * @author Julian Edwards
     */
    public double average() { return IntStream.of(values).average().orElseThrow(); }

    /**
     * @return the maximum value.
     * @throws java.util.NoSuchElementException if there are no values present (should never happen).
     *
     * @since 23 October 2023
     * @author Julian Edwards
     */
    public int max() { return IntStream.of(values).max().orElseThrow(); }
}
