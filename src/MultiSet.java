public interface MultiSet<T> {
    /*
    An interface representing the MultiSet ADT, which supports the
    add, remove, is_empty, count, and contains operations.
    */
    boolean add(T item);
    void remove(T item);
    boolean contains(T item);
    boolean is_empty();
    int count(T item);
    int size();
}
