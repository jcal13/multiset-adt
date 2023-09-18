public class LinkedListMultiSet<T> implements MultiSet<T> {
    /**
     * Unlike the TreeMultiList, this implementation does not just "wrap" an
     * underlying tree, it is instead a custom LinkedList implementation, which
     * only provides the necessary MultiSet methods.
     *
     * Representation Invariant:
     * front is null represents an empty MultiSet
     */

    private Node<T> front;
    private int size;

    public LinkedListMultiSet() {
        front = null;
        size = 0;
    }

    // You would need to implement the MultiSet interface methods here
    // For example:
    @Override
    public void add(T item) {
        // Implement the add method
    }

    @Override
    public int count(T item) {
        // Implement the count method
        return 0;
    }

    @Override
    public void remove(T item) {
        // Implement the remove method
    }


