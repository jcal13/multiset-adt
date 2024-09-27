abstract class MultiSet {

    /*
    An abstract class representing the MultiSet ADT, which supports the
    add, remove, is_empty, count, and contains operations.

    This class itself does not handle how the underlying data is stored.
     */
    abstract boolean add(Object item);
    abstract boolean remove(Object item);
    abstract boolean contains(Object item);
    abstract boolean is_empty(Object item);
    abstract int count(Object item);
    abstract int size();
}
